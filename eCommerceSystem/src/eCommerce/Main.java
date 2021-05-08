package eCommerce;


import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.EmailVerificationManager;
import eCommerce.core.concretes.GoogleAccountManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager( new HibernateUserDao(), new GoogleAccountManagerAdapter(), new EmailVerificationManager(), new AuthManager());
		
		User user1 = new User(1,"murathansolmaz555@gmail.com","123123","Murat","Solamz");
		User user2 = new User(2,"murat@hotmail.com","123123","Murat","Solmaz");
		User user3 = new User(2,"saasdfadgg","123123","Murat","Solmaz");
		
		
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		
		
		userService.login("murathansolmaz555@gmail.com", "123123");
		userService.login("murat@hotmail.com", "123123");
		
		userService.loginWithService(user2);
		userService.logOut(user2);
		
		userService.delete(user2);
		for (User user : userService.getAll()) {
			System.out.println(user.getEmail());
		}

	}

}
