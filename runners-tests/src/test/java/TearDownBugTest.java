import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.testing.TestPipeline;
import org.junit.Rule;
import org.junit.Test;

public class TearDownBugTest {
  @Rule
  public final transient TestPipeline p = TestPipeline.create();

  @Test
  public void testsLongTearDown() throws Exception {
    TearDown.runPipeline(p);
  }

  public static void main(String[] args) throws Exception {
    PipelineOptions options = PipelineOptionsFactory.fromArgs(args).create();
    TearDown.runPipeline(Pipeline.create(options));
  }

}
