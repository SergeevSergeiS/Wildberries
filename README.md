```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide
        State4: JUnit5
        State5: Gradle
        State6: GitHub
        State7: Jenkins
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        note right of State2 : Работа с кодом
        note left of State3 : Фреймворк
        note right of State4 : Тесты
        note left of State5 : Сборка проекта
        note right of State6 : Система контроля версий и хостинг проекта
        note left of State7 : Параметризация сборки
```
