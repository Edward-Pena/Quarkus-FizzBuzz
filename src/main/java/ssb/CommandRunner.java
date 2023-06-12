package ssb;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

import java.lang.annotation.Inherited;
import java.util.logging.Logger;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {
    private final FizzBuzz fizzBuzz;
    private static final Logger LOG = Logger.getLogger(CommandRunner.class.getName());

    @Inject
    public CommandRunner(FizzBuzz fizzBuzz) {
        super();
        this.fizzBuzz = fizzBuzz;
    }
    @Override
    public int run(String... args) throws Exception {
        LOG.info("Starting application");
        fizzBuzz.execute();
        LOG.info("Ending of code");
        return 0;
    }


}
