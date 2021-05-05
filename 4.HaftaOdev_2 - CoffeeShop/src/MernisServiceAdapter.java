import java.rmi.RemoteException;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy  client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.nationaltyId, customer.firstName.toUpperCase(), customer.lasName.toUpperCase(),customer.date);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
