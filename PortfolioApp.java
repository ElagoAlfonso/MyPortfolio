package AlfonsoPortfolioInheritance;

class PortfolioApp {
	
	
    // Declaration of frame OBJECTS
    private LoginFrame loginFrame;  
    private HomePageFrame homePageFrame;
    private AboutMeFrame aboutMeFrame;
    private ProfileFrame profileFrame;
    private Educational_Background educationalBackgroundFrame;

    public PortfolioApp() {
    	
        // Constructor for the PortfolioApp class
        // Initializing frame objects with specific sizes
        loginFrame = new LoginFrame(1100, 635);
        homePageFrame = new HomePageFrame(1100, 635);
        aboutMeFrame = new AboutMeFrame(1100, 635);
        profileFrame = new ProfileFrame(1100, 635);
        educationalBackgroundFrame = new Educational_Background(1100, 635);
    }

    public void run() {
                              // Logic to handle navigation and display frames accordingly
        loginFrame.display(); // Display the login frame initially
    }
}