package com.fintrack.fintrack_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // १. हा मुख्य वेटर (कंट्रोलer) आहे जो ब्राउझरच्या रिक्वेस्ट स्वीकारेल
public class WelcomeController {

    @GetMapping("/FirstApiTesting") // २. ब्राउझरमध्ये /FirstApiTesting टाकल्यावर हा मेसेज ट्रिगर होईल
    public String welcome() {
        return "FinTrack First API Successfully Working";
    }
}

