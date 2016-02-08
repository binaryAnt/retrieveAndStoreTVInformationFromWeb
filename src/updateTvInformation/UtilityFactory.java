package updateTvInformation;

import configuration.ConfigurationDatabase;
import configuration.ConfigurationTVSeriesCrawling;

public abstract class UtilityFactory {

	protected ConfigurationTVSeriesCrawling confTVSeriesCrawling;
	protected ConfigurationDatabase confDatabase;

	public UtilityFactory(ConfigurationDatabase confDatabase, ConfigurationTVSeriesCrawling confTVSeriesCrawling) {
		this.confDatabase = confDatabase;
		this.confTVSeriesCrawling = confTVSeriesCrawling;
	}

	public abstract EpisodesPersistant createEpisodesPersistant();

}