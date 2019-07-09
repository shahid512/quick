$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/one/shout.feature");
formatter.feature({
  "name": "shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saun and lucia are within range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Saun is 20 meters away from lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "first.saun_is_meters_away_from_lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saun shouts \"free coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "first.saun_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia listens to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "first.lucia_listens_to_the_message()"
});
formatter.result({
  "status": "passed"
});
});