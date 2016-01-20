/* items sold:
books @ $5.00 each
bookmarks @ $1 each, 6 for $5
paintings @$100

customers can purchase any number of each item.
but, some rules apply:
- for bookmarks, packs will be used to get cheapest price
- add 7% tax for pgh
- round values to the nearest cent
- running a promotion:
  * every third customer gets 10% off their order (starts at 3rd)
  * discount applied, then tax calculated
  * if they don't get discount, print
    "You did not get a discout! Better luck next time!"
  * if they do get a discount, print
    "You won a 10% discount!"

pseudocode

ask if another customer is waiting in line,
    if yes continue, if no exit the program (while loop)

show a menu with all items and prices, and options
  to show current order and check out

customers should be able to modify their order, say 4 but
  then 3 - need to put one back

*/
import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int customer_waiting;
        System.out.println("Is another customer waiting in line? [1=yes;2=no]");
        customer_waiting = user_input.nextInt();

        while (customer_waiting == 1) {
          // this is where the meat of the program is

            System.out.println("Is another customer waiting in line? [1=yes;2=no]");
            if (customer_waiting == 2) {
              break;
          }
        }
    }
}
