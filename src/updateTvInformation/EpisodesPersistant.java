package updateTvInformation;

import configuration.ConfigurationDatabase;

public abstract class EpisodesPersistant {

	ConfigurationDatabase dbConf;
	
	public EpisodesPersistant(ConfigurationDatabase dbConf){
		this.dbConf = dbConf;
	}
	
	
	public abstract void persistEpisodes(Episodes e);
}
