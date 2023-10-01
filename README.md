# Week 3 Group Assignment

Kevin Li, Stefan Vuia, Zixuan Lu, Kathy Xu, and Kimlan Huynh

## Problem Domain and Project Overview

The problem domain for our project is Travel. We are considering a travel planning application with some of the following features:

- Account creation, login to account, access saved info on account
- Creating, saving, and accessing trip objects for a destination
- Searching up points of interest and allowing users to choose and add them to trip
- Fetching location data for each point in the trip and placing markers on a map
- Generating an itinerary for the trip object

## API 

We are planning to use the Nominatim API for geocoding and location information, such as longitude,
latitude, full address, and location type. This API uses OpenStreetMap data, the API documentation can 
be found at [here](https://nominatim.org/release-docs/develop/api/Overview/#nominatim-api "Nominatim Manual"). Example outputs 
from Java and Hoppscotch.io can be found below, see `src/Main.java` for the full java code.

![example api call](img/api_web_ex.png "web example")
![example api java code](img/api_java_ex.png "java example")