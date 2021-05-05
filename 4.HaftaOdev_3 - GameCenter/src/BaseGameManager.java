
public abstract class BaseGameManager implements GameService {

	@Override
	public void campaign(Game game) {
		
		System.out.println("New campaign for : " + game.name + " %10 ");
		
	}
	
	@Override
	public void deleteCampaign(Game game) {
		System.out.println("Deleted Campaign");
	}
	
	@Override
	public void updateCampaign(Game game,int num) {
		System.out.println("New campaign for : " + game.name + " % " + num);
		
	}
	
	
	@Override
	public void sellGame(Customer customer,Game game) {
		
		System.out.println("This game : " + game.name + " sold to this customer : " + customer.firstName);
		
	}
}
