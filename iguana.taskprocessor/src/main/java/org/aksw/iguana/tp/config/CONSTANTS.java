package org.aksw.iguana.tp.config;

/**
 * Constants used only by TaskProcessor
 * 
 * @author f.conrads
 *
 */
public class CONSTANTS {

    /**
     * The key to set the workerID in the Extra Meta properties
     * and the properties name in the final results to get the workerID
     */
    public static final String WORKER_ID_KEY = "workerID";

    /**
     * The key to set the workerType in the Extra Meta properties
     * and the properties name in the final results to get the workerType
     */
    public static final String WORKER_TYPE_KEY = "workerType";

    /**
     * The key to set/get the base value for the gaussian intervall 
     * which will be used to randomly select a time to wait before each query
     */
    public static final String GAUSSIAN_LATENCY = "gaussianLatency";

    /**
     * The key to set/get a fixed value to wait before each query
     */
    public static final String FIXED_LATENCY = "fixedLatency";

    /**
     * The key to get/set the current sparql endpoint to test
     */
    public static final String SPARQL_CURRENT_ENDPOINT = "sparqlEndpoint";

    /**
     * The key to get/set the timeout for sparql queries
     * 0 and less means no timeout,
     * default is 180s
     */
    public static final String SPARQL_TIMEOUT = "timeout";

    /**
     * The key to get the file name list for the sparql (resp. update) queries
     */
    public static final String QUERY_FILE_LIST = "queryFileList";

    /**
     * The key to get the update strategy.
     * default is NONE
     */	
	public static final String STRESSTEST_UPDATE_STRATEGY = "updateStrategy";

	/**
	 * The key to get the timeLimit parameter. 
	 * be aware that timeLimit can be null.
	 */
	public static final String TIME_LIMIT = "timeLimit";

	/**
	 * The key to set the updateTimer Strategy in the stresstest
	 */
	public static final String STRESSTEST_UPDATE_TIMERSTRATEGY = "updateTimerStrategy";

	/**
	 * The key for the query folder name
	 */
	public static final String QUERIES_FILE_NAME = "queryFile";

	public static final String WORKER_CLASS = "workerClass";

	public static final String WORKER_SIZE = "numberOfWorkers";

	public static final String SERVICE_ENDPOINT = "service";

	public static final String USERNAME = "user";

	public static final String PASSWORD = "password";

	public static final String CLI_INIT_FINISHED = "initFinished";

	public static final String CLI_QUERY_FINISHED = "queryFinished";

	public static final String CLI_ERROR = "queryError";

	public static final String NO_OF_QUERY_MIXES = "numberOfQueryMixes";

	public static final String WARMUP_QUERY_FILE = "warmupQueryFile";

	public static final String WARMUP_TIME = "warmupTime";

	public static final String WARMUP_UPDATES = "warmupUpdates";

	public static final String WORKER_CONFIG_KEYS = "workers";

	public static final String QUERY_HANDLER = "queryHandler";


}
