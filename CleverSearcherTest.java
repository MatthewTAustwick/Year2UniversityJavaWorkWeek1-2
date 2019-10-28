package searcher;

import static org.junit.jupiter.api.Assertions.*;

class CleverSearcherTest extends SearcherTest {

    protected Searcher createSearcher(int[] array, int index) throws IndexingError {
        return new CleverSearcher(array,index);
    }

}