# RolePlayingGame
This is a basic role playing game (RPG) developed in java. The intent of this project is to use the best practice in java application development.

In this RPG first you choose a and a name. It will always show the description of the place you current are and the actions you can make which can be either search for items or go to another place.

You might face some enemies to fight with and you need to beat them to proceed to you jorney. The main objective is to survive and go to a safe place.

##  Steps to build/run/test
### Build
./gradlew build

### Run
./gradlew run

### Test
./gradlew test
* See report on build/reports/tests/test/index.html

## Architecture
### Context
It holds the data for the current game. Singleton class accessed by the whole code.
### GameState
It holds the state of the game with the text to be shown and the available options
### Character
Interface of the player character
### LocalFilePersistance
Have the code for save and resume the game in a local file. The local file is the Context object serialized

## Next steps
* Add test for all classes
* Implement state graph
* Use experience to build level progression
* Fix bugs
* Improve the battle feature using diferent java classes
