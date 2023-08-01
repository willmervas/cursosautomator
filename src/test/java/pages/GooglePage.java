package pages;

public class GooglePage extends BasePage {

    private String searchTextField = "//textarea[@id='APjFqb']";
    private String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]";
    
    public GooglePage (){
        super(driver);

    }
    public void navigatedToGoogle(){
        navigatedTo("https://www.google.com"); 
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

        
    }

    public void clickSearchGoogle(){
        clickElement(searchButton);

    }


}
