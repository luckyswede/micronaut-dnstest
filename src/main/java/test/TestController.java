package test;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class TestController {
    private final TestClient client;

    public TestController(TestClient client) {
        this.client = client;
    }

    @Get("/test")
    Single<String> get() {
        return client.test();
    }
}
