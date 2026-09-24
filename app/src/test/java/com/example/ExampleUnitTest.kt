package com.example

import com.example.data.repository.PyqDataRepository
import com.example.model.PyqClass
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun testClass10HindiSubjectNameAndBooks() {
    val subjects = PyqDataRepository.getSubjectsForClass(PyqClass.CLASS_10)
    
    // Ensure "Hindi (Course A & B)" is removed and "Hindi" is used
    val oldHindi = subjects.find { it.name.contains("Course A & B") }
    assertNull("Old 'Hindi (Course A & B)' should be removed", oldHindi)

    val hindiSubject = subjects.find { it.id == "c10_hin" }
    assertNotNull("Hindi subject must exist", hindiSubject)
    assertEquals("Hindi", hindiSubject?.name)
    assertEquals("हिन्दी", hindiSubject?.hindiName)

    // Verify 2 Hindi books are defined
    val hindiBooks = PyqDataRepository.hindiBooks
    assertEquals(2, hindiBooks.size)

    val kshitij = hindiBooks.find { it.id == "c10_hin_kshitij" }
    assertNotNull("क्षितिज भाग - 2 must exist", kshitij)
    assertEquals("क्षितिज भाग - 2", kshitij?.name)
    assertEquals(17, kshitij?.chaptersCount)

    val kritika = hindiBooks.find { it.id == "c10_hin_kritika" }
    assertNotNull("कृतिका भाग - 2 must exist", kritika)
    assertEquals("कृतिका भाग - 2", kritika?.name)
    assertEquals(5, kritika?.chaptersCount)
  }

  @Test
  fun testClass10HindiOldNcertChapters() {
    // Test Kshitij Bhag 2 chapters
    val kshitijChapters = PyqDataRepository.getChaptersForSubject("c10_hin_kshitij")
    assertEquals(17, kshitijChapters.size)
    assertEquals("पद (सूरदास)", kshitijChapters[0].name)
    assertEquals("राम-लक्ष्मण-परशुराम संवाद (तुलसीदास)", kshitijChapters[1].name)
    assertEquals("नेताजी का चश्मा (स्वयं प्रकाश)", kshitijChapters[9].name)
    assertEquals("बालगोबिन भगत (रामवृक्ष बेनीपुरी)", kshitijChapters[10].name)
    assertEquals("संस्कृति (भदंत आनंद कौसल्यायन)", kshitijChapters[16].name)

    // Test Kritika Bhag 2 chapters
    val kritikaChapters = PyqDataRepository.getChaptersForSubject("c10_hin_kritika")
    assertEquals(5, kritikaChapters.size)
    assertEquals("माता का अँचल (शिवपूजन सहाय)", kritikaChapters[0].name)
    assertEquals("जॉर्ज पंचम की नाक (कमलेश्वर)", kritikaChapters[1].name)
    assertEquals("साना-साना हाथ जोड़ि... (मधु कांकरिया)", kritikaChapters[2].name)
    assertEquals("एही ठैयाँ झुलनी हेरानी हो रामा! (शिवप्रसाद मिश्र 'रुद्र')", kritikaChapters[3].name)
    assertEquals("मैं क्यों लिखता हूँ? (अज्ञेय)", kritikaChapters[4].name)

    // Ensure old generic chapters with id c10_hin are removed
    val oldChapters = PyqDataRepository.getChaptersForSubject("c10_hin")
    assertTrue("Direct c10_hin chapters should be empty as they are in sub-books", oldChapters.isEmpty())
  }
}

