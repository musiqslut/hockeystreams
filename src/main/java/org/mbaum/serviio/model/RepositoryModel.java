package org.mbaum.serviio.model;

import static org.mbaum.common.model.Model.IdBuilder.createId;

import java.util.List;

import org.mbaum.common.model.Model;
import org.mbaum.serviio.net.transferobject.OnlineRepository;
import org.mbaum.serviio.net.transferobject.SharedFolder;


public interface RepositoryModel extends Model<RepositoryModel>
{
	static final ModelValueId<RepositoryModel, List<SharedFolder>> SHARED_FOLDERS = createId();
	static final ModelValueId<RepositoryModel, Boolean> SEARCH_HIDDEN_FILES = createId();
	static final ModelValueId<RepositoryModel, Boolean> SEARCH_FOR_UPDATES = createId();
	static final ModelValueId<RepositoryModel, Boolean> AUTOMATIC_LIBRARY_UPATES = createId();
	static final ModelValueId<RepositoryModel, Integer> AUTOMATIC_LIBRARY_UPDATE_INTERVAL = createId();
	static final ModelValueId<RepositoryModel, List<OnlineRepository>> ONLINE_REPOSITORIES = createId();
	static final ModelValueId<RepositoryModel, Integer> MAXIMUM_NUMBER_OF_ITEMS_FOR_ONLINE_FEEDS = createId();
	static final ModelValueId<RepositoryModel, Integer> ONLINE_FEED_EXPIRY_INTERVAL = createId();
	static final ModelValueId<RepositoryModel, String> ONLINE_CONTENT_PREFERRED_QUALITY = createId();
}