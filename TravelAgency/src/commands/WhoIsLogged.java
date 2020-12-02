package commands;


import Agency.Agency;
import system.AgencySystem;

import static system.AgencySystem.CurrentUser;

public abstract class WhoIsLogged {
        public static void whoIsLogged() {
            if(Agency.isSomebodyLogged)
                AgencySystem.who();
            else
                System.out.println("You are not logged in !");

        }

    }
