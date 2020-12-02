package org.margo.languagesradar

import assertk.assertThat
import assertk.assertions.containsOnly
import org.junit.jupiter.api.Test
import org.margo.languagesradar.Language.*
import org.margo.languagesradar.Languages.latestKnownVersions
import org.margo.languagesradar.parsers.Release

class ScrapperTest {
    
    @Test
    fun testJavaLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(JAVA)
        
        assertThat(latestVersions).containsOnly(
                JAVA to Release(latestKnownVersions[JAVA]!!, listOf("oracle.com/java/technologies/javase/15u-relnotes.html"))
        )
    }

    @Test
    fun testKotlinLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(KOTLIN)
        
        assertThat(latestVersions).containsOnly(
                KOTLIN to Release(latestKnownVersions[KOTLIN]!!, listOf("kotlinlang.org/releases.html"))
        )
    }

    @Test
    fun testScalaLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(SCALA)
        
        assertThat(latestVersions).containsOnly(
                SCALA to Release(latestKnownVersions[SCALA]!!, listOf("github.com/scala/scala/releases/tag/v2.13.4"))
        )
    }

    @Test
    fun testGoLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(GO)
        
        assertThat(latestVersions).containsOnly(
                GO to Release(latestKnownVersions[GO]!!, listOf("golang.org/doc/go1.15"))
        )
    }

    @Test
    fun testRubyLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(RUBY)
        
        assertThat(latestVersions).containsOnly(
                RUBY to Release(latestKnownVersions[RUBY]!!, listOf("www.ruby-lang.org/en/news/2020/10/02/ruby-2-7-2-released/"))
        )
    }
    
    @Test
    fun testSwiftLatestRelease() {
        val latestVersions = Scrapper.getLatestVersions(SWIFT)
        
        assertThat(latestVersions).containsOnly(
                SWIFT to Release(latestKnownVersions[SWIFT]!!, listOf("https://github.com/apple/swift/releases/tag/swift-5.3.1-RELEASE"))
        )
    }
    
    @Test
    fun testAllLatestVersions() {
        val latestVersions = Scrapper.getLatestVersions(JAVA, KOTLIN, SCALA, GO, RUBY, SWIFT)
        
        assertThat(latestVersions.map { (k, v) -> k to v?.version })
                .containsOnly(
                        JAVA to latestKnownVersions[JAVA],
                        KOTLIN to latestKnownVersions[KOTLIN],
                        SCALA to latestKnownVersions[SCALA],
                        GO to latestKnownVersions[GO],
                        RUBY to latestKnownVersions[RUBY],
                        SWIFT to latestKnownVersions[SWIFT],
                )
    }
}