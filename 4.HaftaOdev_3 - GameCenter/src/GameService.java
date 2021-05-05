
public interface GameService {

	void campaign(Game game);
	void updateCampaign(Game game, int num);
	void deleteCampaign(Game game);
	void sellGame(Customer customer, String name);
	void sellGame(Customer customer, Game game);
}
