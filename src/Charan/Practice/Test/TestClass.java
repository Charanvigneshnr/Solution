package Charan.Practice.Test;

import java.util.*;

class Player {
    String name;
    List<Card> cards = new ArrayList<>();

    Player(String name) {
        this.name = name;
    }

    void populateWithCards(String s) {
        this.cards.add(new Card(s.charAt(0), s.substring(1)));
    }
}

class Card implements Comparable<Card> {
    char suit;
    String val;
    String deck = "2345678910jqka";

    Card(char suit, String val) {
        this.suit = suit;
        this.val = val;
    }

    @Override
    public int compareTo(Card other) {
        return deck.indexOf(this.val) - deck.indexOf(other.val);
    }
}

class Game {
    Map<String, Player> players = new HashMap<>();
    List<Card> playedCards = new ArrayList<>();
    char trumpCard;
    List<String> playerNames;

    Game(List<String> playerNames, char trumpCard) {
        for (String name : playerNames) {
            players.put(name, new Player(name));
        }
        this.trumpCard = trumpCard;
        this.playerNames = playerNames;
    }

    void addCardToThePlayer(String playerName, String cardName) {
        Card card = new Card(cardName.charAt(0), cardName.substring(1));
        players.get(playerName).populateWithCards(cardName);
        playedCards.add(card);
    }

    public Card getOptimalCard(Player self) {
        String teammate = (playerNames.indexOf(self.name) % 2 == 0) ? playerNames.get(playerNames.indexOf(self.name) + 2) : playerNames.get(playerNames.indexOf(self.name) - 2);

        Card maxCard = playedCards.get(0);
        for (Card card : playedCards) {
            if ((maxCard.suit == card.suit && card.compareTo(maxCard) > 0) || (card.suit == trumpCard && maxCard.suit != trumpCard)) {
                maxCard = card;
            }
        }
        if (players.get(teammate).cards.contains(maxCard)) {
            return getMinCard(self.cards, '0');
        }
        if (maxCard.suit != trumpCard) {
            Card minBiggerCard = getMinCardGreaterThan(self.cards, maxCard, maxCard.suit);
            if (minBiggerCard != null) {
                return minBiggerCard;
            }
            return getMinCard(self.cards, '0');
        }
        Card maxTeammateTrumpCard = getMaxCard(players.get(teammate).cards, trumpCard);
        Card maxEnemyTrumpCard = null;
        for (String playerName : playerNames) {
            if (playerName.equals(teammate) || playerName.equals(self.name))
                continue;
            Card tempCard = getMaxCard(players.get(playerName).cards, trumpCard);
            if (tempCard != null && (maxEnemyTrumpCard == null || tempCard.compareTo(maxEnemyTrumpCard) > 0)) {
                maxEnemyTrumpCard = tempCard;
            }
        }

        if (maxTeammateTrumpCard == null || (maxEnemyTrumpCard != null && maxEnemyTrumpCard.compareTo(maxTeammateTrumpCard) > 0)) {
            Card minTrumpGreaterThanEnemy = getMinCardGreaterThan(self.cards, maxEnemyTrumpCard, trumpCard);
            if (minTrumpGreaterThanEnemy != null) {
                return minTrumpGreaterThanEnemy;
            }
        }
        return getMinCard(self.cards, '0');
    }

    private Card getMaxCard(List<Card> cards, char suit) {
        cards.sort(Comparator.reverseOrder());
        for (Card card : cards) {
            if (card.suit == suit) {
                return card;
            }
        }
        return null;
    }

    private Card getMinCard(List<Card> cards, char suit) {
        cards.sort(Comparator.naturalOrder());
        for (Card card : cards) {
            if (suit == '0' || card.suit == suit) {
                return card;
            }
        }
        return null;
    }

    private Card getMinCardGreaterThan(List<Card> cards, Card targetCard, char targetSuit) {
        Card minGreaterCard = null;
        for (Card card : cards) {
            if (card.suit == targetSuit && card.compareTo(targetCard) > 0) {
                if (minGreaterCard == null || card.compareTo(minGreaterCard) < 0) {
                    minGreaterCard = card;
                }
            }
        }
        return minGreaterCard;
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        HashMap<String, String> map = new HashMap<>();
        String[] parts = input.split(";");
        for (String part : parts) {
            String[] ipMap = part.split(":");
            map.put(ipMap[0], ipMap[1]);
        }

        List<String> playerNames = Arrays.asList(map.get("players").split(","));
        char trump = map.get("trump").charAt(0);
        Game game = new Game(playerNames, trump);

        for (String playerName : playerNames) {
            if (map.containsKey(playerName)) {
                game.addCardToThePlayer(playerName, map.get(playerName));
            }
        }

        Player self = game.players.get(map.get("self"));
        for (String cardStr : map.get("cards").split(",")) {
            self.populateWithCards(cardStr);
        }

        Card optimalCard = game.getOptimalCard(self);
        System.out.println(optimalCard.suit + optimalCard.val);
    }
}
