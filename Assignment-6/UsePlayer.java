interface Player {
    void play();
}

class Child implements Player {
    @Override
    public void play() {
        System.out.println("Child is playing - Having fun and engaging in recreational activities.");
    }
}

class Musician implements Player {
    @Override
    public void play() {
        System.out.println("Musician is playing - Performing music on a musical instrument.");
    }
}

class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Actor is playing - Portraying a character in a dramatic performance.");
    }
}

public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        System.out.println("Child:");
        child.play();

        System.out.println("\nMusician:");
        musician.play();

        System.out.println("\nActor:");
        actor.play();
    }
}


/*
Child:
Child is playing - Having fun and engaging in recreational activities.

Musician:
Musician is playing - Performing music on a musical instrument.

Actor:
Actor is playing - Portraying a character in a dramatic performance. 
 */