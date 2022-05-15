```mermaid        
    stateDiagram-v2
        State1: START
        
        State1 --> State2: Java & IntelliJ IDEA
        State2 --> State3: Selenide
        State3 --> State4: JUnit5
        State4 --> State5: Gradle
        State5 --> State6: GitHub
        State6 --> State7: Jenkins
        note right of State2
            Important information! You can write
            notes.
        end note
        note left of State2 : Параметризация и сборка.
```
