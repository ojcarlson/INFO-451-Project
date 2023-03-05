import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class InventorySystem {
    public static void main(String[] args) throws SQLException {
        //connection to Inventory schema in database
        //Connection connection = DatabaseConnection.getConnection();

        BuildingLocation buildingLocation;
        InventoryAccount inventoryAccount;
        ArrayList<Inventory> inventory = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("     Inventory Menu");
            System.out.println("_____________________________");
            System.out.println("  1.  Search ");
            System.out.println("  2.  Create Inventory");
            System.out.println("  3.  Remove Inventory Equipment at Building Location");
            System.out.println("  5.  Display Building Inventory");
            System.out.println("  6.  Exit");
            System.out.println();
            System.out.print("Please input your choice <1-4>:");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    //searchInventoryAccount(inventory);
                    break;

                case 2:
                    createInventoryAccount();
                    //inventory.add(inventoryAccount);
                    System.out.println();
                    break;
                case 3:
                    //removeInventory(inventory);
                    break;

                case 5:
                    //displayTables ();
                    //DisplayTableValues();
                    //displayBuildingInventory(inventory);
                    break;

                case 6:

                    System.out.println();
                    keepGoing = false;
                    break;
            }

        }
    }


    public static void displayTables() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        Statement statement;
        statement = connection.createStatement();
        ResultSet resultSet;
        resultSet = statement.executeQuery(
                "select * from Inventory");
        int code;
        String title;
        while (resultSet.next()) {
            buildingLocation = resultSet.getString("buildingLocation");
            heci = resultSet.getString("heci");
            description = resultSet.getString("desciption");
            cost = resultSet.getDouble("cost");
            bayLocation = resultSet.getDouble("bayLocation");
            status = resultSet.getString("status");
            quantity = resultSet.getInt("heci").trim();

            System.out.println("buildingLocation : " + buildingLocation
                    + " heci : " + heci + "description : " + description
                    + " cost: " + cost + " bayLocation: " + bayLocation
                    + " status: " + status + " quantity: " + quantity);
        }
        resultSet.close();
        statement.close();
        connection.close();

        catch(Exception exception)

        {
        System.out.println(exception);
        }
    // function ends
}


        /*public static void displayTables () throws SQLException {
            Connection connection = DatabaseConnection.getConnection();
            String query = "select buildingLocation, heci, description, cost, bayLocation, status, quantity";
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {

                    String buildingLocation = rs.getString("buildingLocation");
                    String heci = rs.getString("heci");
                    String description = rs.getString("PRICE");
                    double cost = rs.getDouble("SALES");
                    double bayLocation = rs.getInt("TOTAL");
                    System.out.println(buildingLocation + ", " + heci + ", " + description +
                            ", " + cost + ", " + bayLocation);
                }
            } catch (SQLException e) {
                JDBCTutorialUtilities.printSQLException(e);
            }
        }
*/



            /*
            Statement dt = connection.createStatement();
            String query = "SELECT * FROM Inventory;";
            dt.executeQuery(query);

            dt.close();
            connection.close();
            }
            */




    /*
            INCLUDE IN CODE
          public static void changeQuantity(ArrayList<Inventory>inventory)

           public static void changeStatus(ArrayList<Inventory>inventory)



     */
    public static void searchInventoryAccount(ArrayList<Inventory>inventory) {
        Scanner s = new Scanner(System.in);
        Inventory buildingLocationExists = null;
        Inventory buildLocateEqualsNull = null;
        Inventory statusEqualsNull = null;
        Inventory heciEqualsNull = null;
        String buildingLocateEquals = getBuildingLocation();
        String statusEquals = getStatus();
        String heciEquals = getHeci();
        BuildingLocation buildingLocation = new BuildingLocation();

        for (Inventory inventory1 : inventory) {
            if (inventory1.getBuildingLocation().getBuildingLocation().equals(buildingLocateEquals) &&
                    (heciEquals.isEmpty() || inventory1.getHeci().equals(heciEquals))
                    && (statusEquals.isEmpty() || inventory1.getStatus().equals(statusEquals)) ) {
                buildingLocationExists = inventory1;
                System.out.println();
                System.out.println(inventory1);

            }

        }
        System.out.println();
        if (buildingLocationExists == null) {
            System.out.println("Building Location Not Found OR Queries Not found");
            System.out.println();
        }

    }


    public static void createInventoryAccount() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        Scanner s = new Scanner(System.in);
        BuildingLocation buildingLocation = new BuildingLocation();
        System.out.print("Please input 2 digit state and four digit Building Location: ");
        buildingLocation.setBuildingLocation(s.nextLine());
        System.out.println();

        System.out.print("Please input the equipment HECI: ");
        String heciNumber = s.nextLine();
        System.out.println();

        System.out.print("Please input the equipment Description: ");
        String descriptionEquip = s.nextLine();
        System.out.println();

        System.out.print("Please input the equipment Cost: ");
        Double costEquip = s.nextDouble();
        System.out.println();

        System.out.print("Please input the equipment Bay Location: ");
        Double bayLocationEquip = s.nextDouble();
        System.out.println();
        s.nextLine();
        System.out.print("Please input the equipment Status: ");
        String statusEquip = s.nextLine();
        System.out.println();

        System.out.print("Please input the Quantity: ");
        Integer quantityEquip = s.nextInt();
        System.out.println();

        System.out.println("Building account created successfully!");
        Statement st = connection.createStatement();
        st.execute("INSERT INTO Inventory (buildingLocation, heci, description, cost, bayLocation, status, quantity) VALUES ( "+ buildingLocation + ", " + heciNumber + ", " + descriptionEquip + ", " + costEquip + ", " + bayLocationEquip + ", " + statusEquip + ", " + quantityEquip + ")" );


        st.close();
        connection.close();
        //return new InventoryAccount(heciNumber, descriptionEquip,
         //       costEquip, bayLocationEquip, statusEquip, quantityEquip, buildingLocation);

    }
    public static void displayBuildingInventory(ArrayList<Inventory>inventory) {
        Inventory buildingLocationExists = null;
        String buildLocateEquals = getBuildingLocation();
        for (Inventory inventory1 : inventory) {
            if (inventory1.getBuildingLocation().getBuildingLocation().equals(buildLocateEquals)) {
                buildingLocationExists = inventory1;
                System.out.println();
                System.out.println(inventory1);
            }
        }
        System.out.println();
        if(buildingLocationExists == null) {
            System.out.println("Building Location Not Found!");
            System.out.println();
        }
    }



    public static String getBuildingLocation() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input the 2 letter state and 4 digit building code number: ");
        String buildingLocation = s.nextLine();
        return buildingLocation;
    }

    public static String getHeci() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input the HECI: ");
        String heci = s.nextLine();
        return heci;
    }
    public static String getStatus() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input the Status: ");
        String heci = s.nextLine();
        return heci;
    }

    public static void removeInventory(ArrayList<Inventory>inventory) {
        Inventory inventoryTBR = null;
        String removeInventoryHeci = getHeci();
        String buildingLocateEqual = getBuildingLocation();
        for (Inventory inventory1 : inventory) {
            if (inventory1.getHeci().equals(removeInventoryHeci) &&
                    inventory1.getBuildingLocation().getBuildingLocation().equals(buildingLocateEqual)) {
                inventoryTBR = inventory1;

            }
        }
        if(inventoryTBR == null) {System.out.println("Not Found");}
        else {inventory.remove(inventoryTBR);
            System.out.println();
        }
    }

    public static boolean exit() {
        boolean keepGoing = true;
        System.out.println();
        keepGoing = false;
        return keepGoing;

    }


 /*public static InventoryAccount createInventoryAccount() {
        Scanner s = new Scanner(System.in);
        BuildingLocation buildingLocation = new BuildingLocation();
        System.out.println();
        System.out.print("Please input the 2 letter state and 4 digit building code: ");
        buildingLocation.setBuildingLocation(s.nextLine());
        return new InventoryAccount(buildingLocation, heci, description, cost, bayLocation, status, quantity
        );
    }
*/
/*
    public static BuildingLocation newBuildingLocation(){
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Plese input 2 letter State and 4 digit Building Location: ");
        String buildId = s.nextLine();
        System.out.println();
        return new BuildingLocation(buildId);

    }

 */
    /*
    public static InventoryAccount addInventoryAccount() {
        Scanner s = new Scanner(System.in);
        BuildingLocation buildingLocation = newBuildingLocation();

        System.out.print("Please input the building Location number: ");
        String buildingNumber = s.nextLine();
        System.out.println();
        System.out.print("Please input the equipment HECI: ");
        String heciNumber = s.nextLine();
        System.out.println();

        System.out.print("Please input the equipment Description: ");
        String descriptionEquip = s.nextLine();
        System.out.println();

        System.out.print("Please input the equipment Cost: ");
        Double costEquip = s.nextDouble();
        System.out.println();

        System.out.print("Please input the equipment Bay Location: ");
        Double bayLocationEquip = s.nextDouble();
        System.out.println();

        System.out.print("Please input the equipment Status: ");
        String statusEquip = s.nextLine();
        System.out.println();

        System.out.print("Please input the equipment Bay Location: ");
        Integer quantityEquip = s.nextInt();
        System.out.println();

        System.out.println("Building account created successfully!");
        return new InventoryAccount(buildingNumber, heciNumber, descriptionEquip,
                costEquip, bayLocationEquip, statusEquip, quantityEquip);
    }
     */

}

