package updateTvInformation;

import configuration.ConfigurationDatabase;
import configuration.ConfigurationTVSeriesCrawling;

public class UtilityFactorySimple extends UtilityFactory {

	public UtilityFactorySimple(ConfigurationDatabase confDatabase,
			ConfigurationTVSeriesCrawling confTVSeriesCrawling) {
		super(confDatabase, confTVSeriesCrawling);
	}

	@Override
	public EpisodesPersistant createEpisodesPersistant() {
		// TODO Auto-generated method stub
		return null;
	}

}