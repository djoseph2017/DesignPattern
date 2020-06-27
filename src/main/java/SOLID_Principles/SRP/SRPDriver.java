package SOLID_Principles.SRP;

class SRPDriver {
    public static void main(String[] args) throws Exception {

        //Crete a journey entity that has its own properties and dont include anything else
        //Create a Persistance that can be reused not only for Journel but for others
        //This way it helps to manage code and refactor it without changing much of it

        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        j.addEntry("I studied this");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "C:\\Users\\dvj00\\Downloads\\journal.txt";
        p.saveToFile(j, filename, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}