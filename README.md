# Game of Life - Code Retreat

Ein Maven-Projekt für einen Code Retreat mit Test-Driven Development (TDD) und JUnit 5.

## Conway's Game of Life

Das Spiel des Lebens ist ein zellulärer Automat, der von John Conway entwickelt wurde. Es besteht aus einem Gitter von Zellen, die sich nach folgenden Regeln entwickeln:

1. Eine lebende Zelle mit weniger als zwei lebenden Nachbarn stirbt (Unterbevölkerung)
2. Eine lebende Zelle mit zwei oder drei lebenden Nachbarn überlebt
3. Eine lebende Zelle mit mehr als drei lebenden Nachbarn stirbt (Überbevölkerung)
4. Eine tote Zelle mit genau drei lebenden Nachbarn wird lebendig (Reproduktion)

## Projekt-Setup

Das Projekt ist bereits vollständig eingerichtet mit:
- ✅ Maven pom.xml mit JUnit 5
- ✅ Standard Maven-Verzeichnisstruktur
- ✅ Basis-Hauptklasse (`GameOfLife.java`)
- ✅ Test-Klasse (`GameOfLifeTest.java`)

## Schnellstart

### Voraussetzungen
- Java 11 oder höher
- Maven 3.6 oder höher

### Bauen und Testen

```bash
# Projekt kompilieren
mvn compile

# Tests ausführen
mvn test

# Hauptklasse ausführen
mvn exec:java -Dexec.mainClass="com.coderetreat.gameoflife.GameOfLife"
```

## Test-Driven Development

Beginne in der Datei `src/test/java/com/coderetreat/gameoflife/GameOfLifeTest.java`:

1. Schreibe einen fehlschlagenden Test
2. Schreibe gerade genug Code, um den Test zu bestehen
3. Refaktoriere den Code
4. Wiederhole

### Beispiel-Testfälle

- Eine lebende Zelle mit weniger als zwei Nachbarn stirbt
- Eine lebende Zelle mit zwei oder drei Nachbarn überlebt
- Eine lebende Zelle mit mehr als drei Nachbarn stirbt
- Eine tote Zelle mit genau drei Nachbarn wird lebendig

## Projektstruktur

```
.
├── pom.xml                           # Maven-Konfiguration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/coderetreat/gameoflife/
│   │           └── GameOfLife.java   # Hauptklasse
│   └── test/
│       └── java/
│           └── com/coderetreat/gameoflife/
│               └── GameOfLifeTest.java # Test-Klasse
└── README.md
```

## Viel Erfolg beim Code Retreat! 🚀