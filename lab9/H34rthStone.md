# H34rthStone
Second project for object-oriented programming 

## Points: 4

The idea is to write an application based on mobile card board game from Blizzard named HearthStone.
What does it look like can be found for example here: https://www.youtube.com/watch?v=ymuVLuVlsOU
## In general:
1. There are 2 players.
2. Each player has his own **DECK**, **HAND** and **HEALTH POINTS**.
    1. *Deck* is what we call on all cards of the players which can be available during one match. But there has to be set a limit to deck cards - for example 40.
    1. *Cards in hand* are cards currently available for player to play. By default, one player can only have max of 10 cards on hand.
    1. *Health points* describe how much health one player has. Starting number of HP can be set as 30.
3. Players play on one board divided into 2 parts which belong respectively to Player1 and Player2. Each part of board is designed for placing there summoned monsters. One player can summon number of max monsters which is (for example) 7.
4. Match is divided into turns. During one turn only one player can play his cards. Other player has to wait for his opponents turn to end if he want to play his      cards. 
5. By default, cards are divided into 2 categories: spells and monsters, but for the purpose of this project spells are optional.
6. During match, players' objective is to make opponents HP<=0 with his cards. The most basic way to do that is to summon monsters and make them attack enemy.
7. Each player starts with 1 mana. The amount of mana is incremented by 1 every player's turn <not during his opponent's turn> until max of 10 mana points.
8. Each monster card has 3 characteristics: **mana cost**, **attack and life points** and *special skills (optional)*. 
    1. *MANA COST*
       It is required number of mana points for player to play this specific card. After the card is played, player's mana points are decreased by mana cost of this        card. For example, I can summon 2 monsters which mana cost sums up to 7, when I have 7 mana, but I can also summon 1 monster for 6 mana too.
    2. *ATTACK POINTS*
       It is number which describes how strong monster is. If monster hits enemy player, opponents HP is decreased by this number. The same goes for attacking the          monsters. 
    3. *LIFE POINTS*
       It' just a number which tells us how strong attack can this monster endure. If it drops below 1, monster dies and disappears.
9. During turn, each monster may attack once any enemy target. If monster hits another monster, they both are being hit with opponents AP
     (for example: my monster with 3 AP and 6 LP attacks enemy monster with 7 AP and 1 LP. Then after this exchange of blows, both monsters die, because my monster       is being hit for 7 damage and enemy monster is being hit for 3 damage)
  
