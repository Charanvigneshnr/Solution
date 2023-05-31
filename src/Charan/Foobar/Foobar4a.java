/*
You've been cornered by one of Commander Lambdas elite bunny trainers! Fortunately, you grabbed a beam weapon from an abandoned storeroom while you were running through the station, so you have a chance to fight your way out. But the beam weapon is potentially dangerous to you as well as to the bunny trainers: its beams reflect off walls, meaning you'll have to be very careful where you shoot to avoid bouncing a shot toward yourself!Luckily, the beams can only travel a certain maximum distance before becoming too weak to cause damage. You also know that if a beam hits a corner, it will bounce back in exactly the same direction. And of course, if the beam hits either you or the bunny trainer, it will stop immediately (albeit painfully). Write a function solution(dimensions, your_position, trainer_position, distance) that gives an array of 2 integers of the width and height of the room, an array of 2 integers of your x and y coordinates in the room, an array of 2 integers of the trainer's x and y coordinates in the room, and returns an integer of the number of distinct directions that you can fire to hit the elite trainer, given the maximum distance that the beam can travel.The room has integer dimensions [1 < x_dim <= 1250, 1 < y_dim <= 1250]. You and the elite trainer are both positioned on the integer lattice at different distinct positions (x, y) inside the room such that [0 < x < x_dim, 0 < y < y_dim]. Finally, the maximum distance that the beam can travel before becoming harmless will be given as an integer 1 < distance <= 10000.For example, if you and the elite trainer were positioned in a room with dimensions [3, 2], your_position [1, 1], trainer_position [2, 1], and a maximum shot distance of 4, you could shoot in seven different directions to hit the elite trainer (given as vector bearings from your location): [1, 0], [1, 2], [1, -2], [3, 2], [3, -2], [-3, 2], and [-3, -2]. As specific examples, the shot at bearing [1, 0] is the straight line horizontal shot of distance 1, the shot at bearing [-3, -2] bounces off the left wall and then the bottom wall before hitting the elite trainer with a total shot distance of sqrt(13), and the shot at bearing [1, 2] bounces off just the top wall before hitting the elite trainer with a total shot distance of sqrt(5).
Your code should pass the following test cases.Note that it may also be run against hidden test cases not shown here.
Input:Solution.solution([3,2], [1,1], [2,1], 4)Output:7
Input:Solution.solution([300,275], [150,150], [185,100], 500)Output:9
Your code will be compiled using standard Java 8. All tests will be run by calling the solution() method inside the Solution class
Execution time is limited.
Wildcard imports and some specific classes are restricted (e.g. java.lang.ClassLoader). You will receive an error when you verify your solution if you have used a restricted class.
Third-party libraries, input/output operations, spawning threads or processes and changes to the execution environment are not allowed.
Your solution must be under 32000 characters in length including new lines and other non-printing characters.
*/
package Charan.Foobar;

import java.util.HashSet;
import java.util.Set;


public class Foobar4a {
    public static double computeDist(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }

    public static int computeGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return Math.abs(x);
    }

    public static int[] getEntityPositionFromRoomNumber(int[] entity, int[] roomNumber, int[] dimensions) {
        int r_x = roomNumber[0];
        int r_y = roomNumber[1];
        int e_x = entity[0];
        int e_y = entity[1];
        int dim_x = dimensions[0];
        int dim_y = dimensions[1];

        int res_x = dim_x * r_x + e_x;
        int res_y = dim_y * r_y + e_y;

        if (r_x % 2 != 0) {
            res_x = dim_x * r_x + (dim_x - e_x);
        }

        if (r_y % 2 != 0) {
            res_y = dim_y * r_y + (dim_y - e_y);
        }

        return new int[]{res_x, res_y};
    }

    public static int solution(int[] dimensions, int[] yourPosition, int[] trainerPosition, int distance) {
        int dim_x = dimensions[0];
        int dim_y = dimensions[1];
        int m_x = yourPosition[0];
        int m_y = yourPosition[1];

        int num_rooms_above_x_axis = (distance + m_y) / dim_y + 1;
        int num_rooms_below_x_axis = (distance - m_y) / dim_y + 1;
        int num_rooms_left_of_y_axis = (distance - m_x) / dim_x + 1;
        int num_rooms_right_of_y_axis = (distance + m_x) / dim_x + 1;

        int w = (num_rooms_right_of_y_axis + num_rooms_left_of_y_axis) * dim_x + 1;
        int h = (num_rooms_above_x_axis + num_rooms_below_x_axis) * dim_y + 1;

        int x_offset = num_rooms_left_of_y_axis * dim_x;
        int y_offset = num_rooms_below_x_axis * dim_y;

        int[][] matrix = new int[w][h];

        for (int i = -1 * num_rooms_left_of_y_axis; i < num_rooms_right_of_y_axis; i++) {
            for (int j = -1 * num_rooms_below_x_axis; j < num_rooms_above_x_axis; j++) {
                int[] tv = getEntityPositionFromRoomNumber(trainerPosition, new int[]{i, j}, dimensions);
                int[] mv = getEntityPositionFromRoomNumber(yourPosition, new int[]{i, j}, dimensions);
                int tv_x = tv[0] + x_offset;
                int tv_y = tv[1] + y_offset;
                int mv_x = mv[0] + x_offset;
                int mv_y = mv[1] + y_offset;
                matrix[tv_x][tv_y] = 1;
                matrix[mv_x][mv_y] = 2;
            }
        }

        int hits = 0;
        Set<String> shotsTaken = new HashSet<>();

        for (int i = -1 * num_rooms_left_of_y_axis; i < num_rooms_right_of_y_axis; i++) {
            for (int j = -1 * num_rooms_below_x_axis; j < num_rooms_above_x_axis; j++) {
                int[] t = getEntityPositionFromRoomNumber(trainerPosition, new int[]{i, j}, dimensions);
                if (distance < computeDist(t, yourPosition)) {
                    continue;
                }
                int delta_y = t[1] - m_y;
                int delta_x = t[0] - m_x;
                int d = computeGCD(delta_y, delta_x);
                delta_y /= d;
                delta_x /= d;
                String shot = delta_y + "," + delta_x;
                if (shotsTaken.contains(shot)) {
                    continue;
                }
                shotsTaken.add(shot);
                int ray_x = m_x + x_offset;
                int ray_y = m_y + y_offset;

                while (true) {
                    ray_x += delta_x;
                    ray_y += delta_y;
                    int entity = matrix[ray_x][ray_y];

                    if (entity == 1) {
                        hits++;
                        break;
                    } else if (entity == 2) {
                        break;
                    }
                }
            }
        }

        return hits;
    }
}
