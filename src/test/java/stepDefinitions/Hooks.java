package stepDefinitions;


import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {
        //write a code that will give you place id
        //execute this code only when place id is null

        StepDefinition m = new StepDefinition();

        if (m.place_id == null) {
            m.add_place_payload_with("Shetta", "French", "India");
            m.user_calls_with_http_request("addPlaceAPI", "POST");
            m.verify_place_id_created_maps_to_using("Shetta", "getPlaceAPI");
        }
    }

}
