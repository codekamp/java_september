package CodeKamp;

/**
 * Created by cerebro on 25/09/16.
 */
public class Demo {

    private static boolean internetWorking = false;

    public static void main(String[] args) {


        try {
            int percentage = Demo.fetchPercentage(12345);
            System.out.println("Percentage is " + percentage);
        } catch (InternetNotWorkingException e) {
            System.out.println("Please check your intenet settings.");
        } catch (RollnumberNotFoundException e) {
            System.out.println("The rollnumber you entered is not valid.");
        }

        try {
            Demo.makeSandwich();
        } catch (DukkanBandException e) {
            e.printStackTrace();
        } catch (PaiseKhoGayeException e) {
            e.printStackTrace();
        }
    }

    public static int fetchPercentage(int rollnumber) throws InternetNotWorkingException, RollnumberNotFoundException {

        //code to check connectivity

        if(!internetWorking) {
            throw new InternetNotWorkingException();
        }

        //code to access database
        if(rollnumber != 12345) {
            throw new RollnumberNotFoundException();
        }

        return 75;
    }

    public static void makeSandwich() throws DukkanBandException, PaiseKhoGayeException {

            Demo.bringBread();
    }

    public static void bringBread() throws DukkanBandException, PaiseKhoGayeException {

    }
}
