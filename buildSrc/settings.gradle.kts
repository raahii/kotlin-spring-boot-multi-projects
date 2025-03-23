plugins {
    id("dev.panuszewski.typesafe-conventions") version "0.5.1"
}

typesafeConventions {
    // enable or disable support for version catalog typesafe accessors in plugins block of a convention plugin
    accessorsInPluginsBlock = true

    // enable or disable auto dependency for every alias(...) plugin declaration in a convention plugin
    // set it to 'false' if you prefer to add plugin marker dependencies manually (you can use the pluginMarker helper method for that)
    autoPluginDependencies = true
}