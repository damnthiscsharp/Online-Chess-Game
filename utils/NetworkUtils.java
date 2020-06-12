package utils;

import java.util.List;

import network.NetworkClient;

public class NetworkUtils {

	public static NetworkClient getClientByName(String name, List<NetworkClient> clients)
	{
		for(NetworkClient c : clients)
		{
			if(c.getUsername() == name)
			{
				return c;
			}
		}
		return null;
	}
	
}
