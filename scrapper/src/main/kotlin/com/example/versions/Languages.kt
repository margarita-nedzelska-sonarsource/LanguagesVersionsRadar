package com.example.versions

object Languages {
    
    val releasesUrl: Map<Language, String> = mapOf(
        Language.JAVA to "https://www.oracle.com/java/technologies/javase/jdk-relnotes-index.html",
        Language.KOTLIN to "https://kotlinlang.org/releases.html",
        Language.SCALA to "https://github.com/scala/scala/releases",
        Language.GO to "https://golang.org/doc/devel/release.html",
        Language.RUBY to "https://www.ruby-lang.org/en/downloads/releases/",
        Language.APEX to "https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_intro_what_is_apex.htm",
        Language.SWIFT to "https://swift.org/download/#releases",
        Language.DOTTY to "https://github.com/lampepfl/dotty/releases",
    )
    
    val supportedVersions: Map<Language, String> = mapOf(
        Language.JAVA to "14",
        Language.KOTLIN to "1.4",
        Language.SCALA to "2.13",
        Language.GO to "1.15",
        Language.RUBY to "2.7",
        Language.APEX to "50",
        Language.SWIFT to "5.3",
        Language.DOTTY to "0.26.0"
    )

    val latestKnownVersions: Map<Language, String> = mapOf(
        Language.JAVA to "15",
        Language.KOTLIN to "1.4.30",
        Language.SCALA to "2.13.4",
        Language.GO to "1.16",
        Language.RUBY to "3.0.0",
        Language.APEX to "50",
        Language.SWIFT to "5.3.3",
        Language.DOTTY to "0.26.0"
    )
    
}

enum class Language {
    JAVA,
    KOTLIN,
    SCALA,
    GO,
    RUBY,
    APEX,
    SWIFT,
    DOTTY
}