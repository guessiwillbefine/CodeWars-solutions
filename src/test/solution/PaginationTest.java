package solution;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PaginationTest {
    @Test
    public void Test(){
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        helper.pageCount(); //should == 2
        helper.itemCount(); //should == 6
        helper.pageItemCount(0); //should == 4
        helper.pageItemCount(1); // last page - should == 2
        helper.pageItemCount(2); // should == -1 since the page is invalid
        // pageIndex takes an item index and returns the page that it belongs on
        helper.pageIndex(5); //should == 1 (zero based index)
        helper.pageIndex(2); //should == 0
        helper.pageIndex(20); //should == -1
        helper.pageIndex(-10); //should == -1
    }
}
