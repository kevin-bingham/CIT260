/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */

package cityOfAaron;

import cityOfAaron.model.TeamMember;
import cityOfAaron.model.Player;

/**
 *
 * @author kbingham
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Kevin");
        
        System.out.println(playerOne.toString());
        System.out.println(TeamMember.Tyler.getName());
        System.out.println(TeamMember.Tyler.getTitle());
    }
    
}