package in.ac.iiitd.guestacc;

/**
 * Created by rakesh on 19/4/18.
 */

public class Admin_Data_PendingApproval_RoomData
{
    String guest1 ;
    String guest2 ;
    String preference ;


    Admin_Data_PendingApproval_RoomData()
    {

        preference = "BH1" ;
        guest1 = "Male" ;
        guest2 = "Female" ;
    }

    public Admin_Data_PendingApproval_RoomData(String guest1, String guest2, String preference) {

        this.guest1 = guest1;
        this.guest2 = guest2;
        this.preference = preference;

    }
}