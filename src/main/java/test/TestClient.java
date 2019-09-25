package test;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("https://www.google.com")
public interface TestClient {
    @Get
    Single<String> test();
}
