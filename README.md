# RolePlayingGame
This is a basic role playing game (RPG) developed in java. The intent of this project is to use the best practice in java application development.

In this RPG first you choose a character. It will always show the description of the place you current are and the actions you can make which can be either search for items or go to another place.

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
Interface of the player character. Create character using CharacterFactory pattern
### LocalFilePersistance
Have the code for save and resume the game in a local file. The local file is the Context object serialized

## Next steps
* Add test for all classes
* Implement state graph
* Use experience to build level progression
* Fix bugs
* Improve the battle feature using diferent java classes

## Considerations
#Flaws
1. Gradle build failure. Environment issue.
2. Some props. modifiers
3. Context is too open and can be changed by components that shouldn't do it
4. No Exception handling or Recovery strategy
5. Solution is not easy to extend
	*  Extend oppon configuration?

#Improvements
1. Put the name of the saved file (persistence) in a properties file
2. !Create an abstraction for persistence classes!
3. Handle exceptions and recovery procedures
4. Make Context changeble only in Game.class
5. Makea graph structure for states connecting related states
6. Make properties files to specify what dependencies to use (persistence, )
7. Actions should not change Context props
