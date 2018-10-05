interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void menace() {
                System.out.println("DragonZilla.menace()");
            }

            @Override
            public void destroy() {
                System.out.println("DragonZilla.destroy()");
            }
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire() {
            @Override
            public void menace() {
                System.out.println("VeryBadVampire.menace()");
            }

            @Override
            public void destroy() {
                System.out.println("VeryBadVampire.destroy()");
            }

            @Override
            public void kill() {
                System.out.println("VeryBadVampire.kill()");
            }

            @Override
            public void drinkBlood() {
                System.out.println("VeryBadVampire.drinkBlood()");
            }
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
