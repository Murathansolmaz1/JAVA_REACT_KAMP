
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.firstName = "Murathan";
		customer1.lastName = "Solmaz";
		customer1.birthyear = 1998;
		customer1.nationalityId = 11111111111L;
		
		BaseCustomerManager baseCustomerManager = new GeneralCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.Save(customer1);
		baseCustomerManager.Update(customer1);
		baseCustomerManager.Delete(customer1);
		
		Game game1 = new Game();
		game1.id = 1;
		game1.name = "God OF War";
		
		BaseGameManager baseGameManager= new GeneralGameManager();
		baseGameManager.campaign(game1);
		baseGameManager.deleteCampaign(game1);
		baseGameManager.updateCampaign(game1, 25);
		baseGameManager.sellGame(customer1, game1);
		
		

	}

}
