package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] = new Executive("Moaath Alrajab", "987 Farmingdale St", "123-4567", "090-01-2300", 7000.00);
        staffList[1] = new StaffEmployee("Marlen Zavala", "988 Farmingdale St", "145-3468", "161-17-1691", 2000.00);
        staffList[2] = new StaffEmployee("Andrea Mejia", "989 Farmingdale St", "631-1253", "240-28-3422",2000.00);
        staffList[3] = new StaffEmployee("Abdul Ahmed", "986 Farmingdale St", "259-9160", "321-03-3903", 2000.00);
        staffList[4] = new TempEmploee("Joel Saravia", "985 Farmingdale St", "959-6290", "484-22-4869", 50.00);
        staffList[5] = new TempEmploee("Salar Saeed", "984 Farmingdale St", "503-9205", "586-77-5802", 50.00);

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
