package com.example.data.repository

import com.example.model.Chapter
import com.example.model.EnglishBook
import com.example.model.ExamYear
import com.example.model.HindiBook
import com.example.model.PyqClass
import com.example.model.PyqQuestion
import com.example.model.QuestionType
import com.example.model.SstBook
import com.example.model.Stream
import com.example.model.Subject

object PyqDataRepository {

    val subjects: List<Subject> = listOf(
        // ==================== CLASS 10 SUBJECTS ====================
        Subject(
            id = "c10_sci",
            classType = PyqClass.CLASS_10,
            name = "Science",
            hindiName = "विज्ञान",
            iconName = "science",
            stream = Stream.ALL,
            chaptersCount = 16,
            totalQuestions = 80,
            description = "Old NCERT के सभी 16 अध्यायों (भौतिकी, रसायन एवं जीव विज्ञान) के JAC बोर्ड के हल प्रश्न।"
        ),
        Subject(
            id = "c10_math",
            classType = PyqClass.CLASS_10,
            name = "Mathematics",
            hindiName = "गणित",
            iconName = "calculate",
            stream = Stream.ALL,
            chaptersCount = 15,
            totalQuestions = 75,
            description = "Old NCERT के सभी 15 अध्यायों (वास्तविक संख्याएँ, त्रिकोणमिति, त्रिभुज, सांख्यिकी आदि) के JAC बोर्ड के हल प्रश्न।"
        ),
        Subject(
            id = "c10_sst",
            classType = PyqClass.CLASS_10,
            name = "Social Science",
            hindiName = "सामाजिक विज्ञान",
            iconName = "public",
            stream = Stream.ALL,
            chaptersCount = 25,
            totalQuestions = 100,
            description = "4 पुस्तकें: History (इतिहास), Geography (भूगोल), Civics (नागरिक शास्त्र) एवं Economics (अर्थशास्त्र) के पिछले वर्षों के हल प्रश्न।",
            isSubSubject = false
        ),
        Subject(
            id = "c10_sst_hist",
            classType = PyqClass.CLASS_10,
            name = "History",
            hindiName = "इतिहास (भारत और समकालीन विश्व - II)",
            iconName = "menu_book",
            stream = Stream.ALL,
            chaptersCount = 5,
            totalQuestions = 25,
            description = "यूरोप में राष्ट्रवाद, भारत में राष्ट्रवाद, भूमंडलीकृत विश्व, औद्योगिकीकरण, मुद्रण संस्कृति।",
            isSubSubject = true,
            parentSubjectId = "c10_sst"
        ),
        Subject(
            id = "c10_sst_geo",
            classType = PyqClass.CLASS_10,
            name = "Geography",
            hindiName = "भूगोल (समकालीन भारत - II)",
            iconName = "public",
            stream = Stream.ALL,
            chaptersCount = 7,
            totalQuestions = 28,
            description = "संसाधन एवं विकास, वन एवं वन्यजीव, जल संसाधन, कृषि, खनिज व ऊर्जा, विनिर्माण उद्योग, अर्थव्यवस्था की जीवन रेखाएँ।",
            isSubSubject = true,
            parentSubjectId = "c10_sst"
        ),
        Subject(
            id = "c10_sst_civ",
            classType = PyqClass.CLASS_10,
            name = "Civics",
            hindiName = "नागरिक शास्त्र (लोकतांत्रिक राजनीति - II)",
            iconName = "account_balance",
            stream = Stream.ALL,
            chaptersCount = 8,
            totalQuestions = 28,
            description = "सत्ता की साझेदारी, संघवाद, लोकतंत्र और विविधता, जाति धर्म व लैंगिक मसले, राजनीतिक दल, लोकतंत्र के परिणाम।",
            isSubSubject = true,
            parentSubjectId = "c10_sst"
        ),
        Subject(
            id = "c10_sst_eco",
            classType = PyqClass.CLASS_10,
            name = "Economics",
            hindiName = "अर्थशास्त्र (आर्थिक विकास की समझ)",
            iconName = "trending_up",
            stream = Stream.ALL,
            chaptersCount = 5,
            totalQuestions = 24,
            description = "विकास, भारतीय अर्थव्यवस्था के क्षेत्रक, मुद्रा और साख, वैश्वीकरण, उपभोक्ता अधिकार।",
            isSubSubject = true,
            parentSubjectId = "c10_sst"
        ),
        Subject(
            id = "c10_hin",
            classType = PyqClass.CLASS_10,
            name = "Hindi",
            hindiName = "हिन्दी",
            iconName = "auto_stories",
            stream = Stream.ALL,
            chaptersCount = 22,
            totalQuestions = 45,
            description = "2 पुस्तकें: क्षितिज भाग - 2 (17 अध्याय) एवं कृतिका भाग - 2 (5 अध्याय) के पिछले वर्षों के हल प्रश्न।",
            isSubSubject = false
        ),
        Subject(
            id = "c10_hin_kshitij",
            classType = PyqClass.CLASS_10,
            name = "क्षितिज भाग - 2",
            hindiName = "क्षितिज भाग - 2",
            iconName = "auto_stories",
            stream = Stream.ALL,
            chaptersCount = 17,
            totalQuestions = 30,
            description = "काव्य खंड (सूरदास, तुलसीदास, देव, जयशंकर प्रसाद, निराला आदि) एवं गद्य खंड (नेताजी का चश्मा, बालगोबिन भगत आदि)।",
            isSubSubject = true,
            parentSubjectId = "c10_hin"
        ),
        Subject(
            id = "c10_hin_kritika",
            classType = PyqClass.CLASS_10,
            name = "कृतिका भाग - 2",
            hindiName = "कृतिका भाग - 2",
            iconName = "menu_book",
            stream = Stream.ALL,
            chaptersCount = 5,
            totalQuestions = 15,
            description = "माता का अँचल, जॉर्ज पंचम की नाक, साना-साना हाथ जोड़ि, एही ठैयाँ झुलनी हेरानी हो रामा, मैं क्यों लिखता हूँ।",
            isSubSubject = true,
            parentSubjectId = "c10_hin"
        ),
        Subject(
            id = "c10_eng",
            classType = PyqClass.CLASS_10,
            name = "English",
            hindiName = "अंग्रेजी",
            iconName = "menu_book",
            stream = Stream.ALL,
            chaptersCount = 21,
            totalQuestions = 40,
            description = "2 पुस्तकें: First Flight (11 अध्याय) एवं Footprints Without Feet (10 अध्याय) के पिछले वर्षों के हल प्रश्न।",
            isSubSubject = false
        ),
        Subject(
            id = "c10_eng_first_flight",
            classType = PyqClass.CLASS_10,
            name = "First Flight",
            hindiName = "फर्स्ट फ्लाइट",
            iconName = "auto_stories",
            stream = Stream.ALL,
            chaptersCount = 11,
            totalQuestions = 22,
            description = "मुख्य पाठ्यपुस्तक: A Letter to God, Nelson Mandela, Two Stories about Flying, Anne Frank, Hundred Dresses, Glimpses of India आदि।",
            isSubSubject = true,
            parentSubjectId = "c10_eng"
        ),
        Subject(
            id = "c10_eng_footprints",
            classType = PyqClass.CLASS_10,
            name = "Footprints Without Feet",
            hindiName = "फुटप्रिंट्स विदाउट फीट",
            iconName = "menu_book",
            stream = Stream.ALL,
            chaptersCount = 10,
            totalQuestions = 18,
            description = "पूरक पाठ्यपुस्तक: A Triumph of Surgery, The Thief's Story, The Midnight Visitor, A Question of Trust, Footprints Without Feet, Bholi आदि।",
            isSubSubject = true,
            parentSubjectId = "c10_eng"
        ),
        Subject(
            id = "c10_sans",
            classType = PyqClass.CLASS_10,
            name = "Sanskrit",
            hindiName = "संस्कृत",
            iconName = "school",
            stream = Stream.ALL,
            chaptersCount = 8,
            totalQuestions = 25,
            description = "शेमुषी भाग-2 एवं संस्कृत व्याकरण के महत्वपूर्ण JAC बोर्ड प्रश्न।"
        ),

        // ==================== CLASS 12 SUBJECTS (SCIENCE STREAM ONLY) ====================
        Subject(
            id = "c12_phy",
            classType = PyqClass.CLASS_12,
            name = "Physics",
            hindiName = "भौतिक विज्ञान",
            iconName = "bolt",
            stream = Stream.SCIENCE,
            chaptersCount = 14,
            totalQuestions = 70,
            description = "Electrostatics, Optics, Magnetism, Modern Physics & Semiconductor with derivations & numericals."
        ),
        Subject(
            id = "c12_chem",
            classType = PyqClass.CLASS_12,
            name = "Chemistry",
            hindiName = "रसायन विज्ञान",
            iconName = "science",
            stream = Stream.SCIENCE,
            chaptersCount = 10,
            totalQuestions = 65,
            description = "Physical, Inorganic and Organic Chemistry solutions with named reactions and mechanisms."
        ),
        Subject(
            id = "c12_math",
            classType = PyqClass.CLASS_12,
            name = "Mathematics",
            hindiName = "गणित",
            iconName = "functions",
            stream = Stream.SCIENCE,
            chaptersCount = 13,
            totalQuestions = 60,
            description = "Calculus, Vectors, 3D Geometry, Matrices, Determinants, LPP and Probability."
        ),
        Subject(
            id = "c12_bio",
            classType = PyqClass.CLASS_12,
            name = "Biology",
            hindiName = "जीव विज्ञान",
            iconName = "biotech",
            stream = Stream.SCIENCE,
            chaptersCount = 13,
            totalQuestions = 55,
            description = "Reproduction, Genetics, Evolution, Biotechnology, and Ecology with diagrams."
        ),
        Subject(
            id = "c12_econ",
            classType = PyqClass.CLASS_12,
            name = "Economics",
            hindiName = "अर्थशास्त्र",
            iconName = "trending_up",
            stream = Stream.SCIENCE,
            chaptersCount = 10,
            totalQuestions = 48,
            description = "Microeconomics & Macroeconomics (व्यष्टि एवं समष्टि अर्थशास्त्र) questions with graphs & numericals."
        ),
        Subject(
            id = "c12_cs",
            classType = PyqClass.CLASS_12,
            name = "Computer Science",
            hindiName = "कंप्यूटर साइंस",
            iconName = "computer",
            stream = Stream.SCIENCE,
            chaptersCount = 10,
            totalQuestions = 52,
            description = "C++ / OOPs, Data Structures (Stack & Queue), SQL & DBMS, Boolean Algebra, Networking & Cyber Law."
        ),
        Subject(
            id = "c12_eng_core",
            classType = PyqClass.CLASS_12,
            name = "English Core",
            hindiName = "अंग्रेजी (Core)",
            iconName = "menu_book",
            stream = Stream.SCIENCE,
            chaptersCount = 12,
            totalQuestions = 38,
            description = "Flamingo, Vistas, Notice, Article, Report and Letter writing previous year questions."
        )
    )

    val chapters: List<Chapter> = listOf(
        // Class 10 Science Chapters (Old NCERT 16 Chapters - Hindi)
        Chapter("c10_sci_ch1", "c10_sci", 1, "रासायनिक अभिक्रियाएँ एवं समीकरण", "Chemical Reactions & Equations", 14, "समीकरण संतुलन, संयोजन, वियोजन, विस्थापन, उपचयन-अपचयन"),
        Chapter("c10_sci_ch2", "c10_sci", 2, "अम्ल, क्षारक एवं लवण", "Acids, Bases & Salts", 12, "pH स्केल, सूचक, विरंजक चूर्ण, बेकिंग सोडा, प्लास्टर ऑफ पेरिस"),
        Chapter("c10_sci_ch3", "c10_sci", 3, "धातु एवं अधातु", "Metals & Non-Metals", 10, "सक्रियता श्रेणी, आयनिक यौगिक, धातु निष्कर्षण, संक्षारण"),
        Chapter("c10_sci_ch4", "c10_sci", 4, "कार्बन एवं उसके यौगिक", "Carbon & its Compounds", 12, "सहसंयोजी आबंध, हाइड्रोकार्बन, समजातीय श्रेणी, साबुन और अपमार्जक"),
        Chapter("c10_sci_ch5", "c10_sci", 5, "तत्वों का आवर्त वर्गीकरण", "Periodic Classification of Elements", 10, "डोबेराइनर त्रिक, न्यूलैंड्स अष्टक, मेंडेलीफ व आधुनिक आवर्त नियम"),
        Chapter("c10_sci_ch6", "c10_sci", 6, "जैव प्रक्रम", "Life Processes", 16, "पोषण, प्रकाश संश्लेषण, श्वसन, मानव हृदय, वृक्क (नेफ्रॉन)"),
        Chapter("c10_sci_ch7", "c10_sci", 7, "नियंत्रण एवं समन्वय", "Control & Coordination", 10, "न्यूरॉन (तंत्रिका कोशिका), प्रतिवर्ती चाप, मस्तिष्क, पादप हार्मोन"),
        Chapter("c10_sci_ch8", "c10_sci", 8, "जीव जनन कैसे करते हैं?", "How do Organisms Reproduce?", 12, "द्विखंडन, मुकुलन, परागण, निषेचन, मानव जनन तंत्र"),
        Chapter("c10_sci_ch9", "c10_sci", 9, "आनुवंशिकता एवं जैव विकास", "Heredity & Evolution", 10, "मेंडल के नियम, लिंग निर्धारण, समजात व समरूप अंग"),
        Chapter("c10_sci_ch10", "c10_sci", 10, "प्रकाश – परावर्तन तथा अपवर्तन", "Light – Reflection & Refraction", 15, "दर्पण सूत्र, आवर्धन, स्नेल का नियम, लेंस सूत्र, लेंस की क्षमता"),
        Chapter("c10_sci_ch11", "c10_sci", 11, "मानव नेत्र तथा रंगबिरंगा संसार", "Human Eye & Colourful World", 10, "समंजन क्षमता, निकट व दूर दृष्टि दोष, वर्ण विक्षेपण, प्रकीर्णन"),
        Chapter("c10_sci_ch12", "c10_sci", 12, "विद्युत", "Electricity", 14, "विद्युत धारा, विभवांतर, ओम का नियम, प्रतिरोधों का संयोजन, जूल तापन"),
        Chapter("c10_sci_ch13", "c10_sci", 13, "विद्युत धारा के चुंबकीय प्रभाव", "Magnetic Effects of Electric Current", 12, "चुंबकीय क्षेत्र रेखाएँ, फ्लेमिंग का वामहस्त नियम, विद्युत मोटर, गैल्वेनोमीटर"),
        Chapter("c10_sci_ch14", "c10_sci", 14, "ऊर्जा के स्रोत", "Sources of Energy", 8, "पारंपरिक व नवीकरणीय ऊर्जा, सौर कुकर, बायोगैस, नाभिकीय ऊर्जा"),
        Chapter("c10_sci_ch15", "c10_sci", 15, "हमारा पर्यावरण", "Our Environment", 10, "पारितंत्र, खाद्य श्रृंखला, 10% नियम, ओजोन परत क्षरण, जैव आवर्धन"),
        Chapter("c10_sci_ch16", "c10_sci", 16, "प्राकृतिक संसाधनों का संपोषित प्रबंधन", "Sustainable Management of Resources", 8, "3R नियम, चिपको आंदोलन, वन एवं वन्यजीव, वर्षा जल संचयन"),

        // Class 10 Mathematics Chapters (Old NCERT 15 Chapters - Hindi)
        Chapter("c10_math_ch1", "c10_math", 1, "वास्तविक संख्याएँ", "Real Numbers", 10, "यूक्लिड विभाजन प्रमेयिका, अंकगणित की आधारभूत प्रमेय, अपरिमेय संख्या सिद्ध करना"),
        Chapter("c10_math_ch2", "c10_math", 2, "बहुपद", "Polynomials", 8, "शून्यकों का ज्यामितीय अर्थ, शून्यकों और गुणांकों में संबंध, त्रिघात बहुपद"),
        Chapter("c10_math_ch3", "c10_math", 3, "दो चर वाले रैखिक समीकरण युग्म", "Pair of Linear Equations in 2 Variables", 12, "ग्राफीय विधि, प्रतिस्थापन विधि, विलोपन विधि, अद्वितीय/अनेक/कोई हल नहीं की शर्तें"),
        Chapter("c10_math_ch4", "c10_math", 4, "द्विघात समीकरण", "Quadratic Equations", 12, "गुणनखंडन विधि, द्विघाती सूत्र (श्रीधराचार्य नियम), विविक्तकर D एवं मूलों की प्रकृति"),
        Chapter("c10_math_ch5", "c10_math", 5, "समांतर श्रेढ़ियाँ", "Arithmetic Progressions", 10, "n-वाँ पद an = a + (n-1)d, प्रथम n पदों का योगफल Sn = n/2[2a + (n-1)d]"),
        Chapter("c10_math_ch6", "c10_math", 6, "त्रिभुज", "Triangles", 12, "थेल्स प्रमेय (आधारभूत आनुपातिकता प्रमेय), समरूप त्रिभुज, पाइथागोरस प्रमेय"),
        Chapter("c10_math_ch7", "c10_math", 7, "निर्देशांक ज्यामिति", "Coordinate Geometry", 10, "दूरी सूत्र, विभाजन सूत्र (Section Formula), संरेखी बिंदु, त्रिभुज का क्षेत्रफल"),
        Chapter("c10_math_ch8", "c10_math", 8, "त्रिकोणमिति का परिचय", "Introduction to Trigonometry", 14, "त्रिकोणमितीय अनुपात, मान सारणी (0°-90°), पूरक कोण, त्रिकोणमितीय सर्वसमिकाएँ"),
        Chapter("c10_math_ch9", "c10_math", 9, "त्रिकोणमिति के कुछ अनुप्रयोग", "Some Applications of Trigonometry", 10, "उन्नयन एवं अवनमन कोण, मीनार, भवन, नदी की चौड़ाई ज्ञात करना"),
        Chapter("c10_math_ch10", "c10_math", 10, "वृत्त", "Circles", 10, "वृत्त की स्पर्श रेखा, स्पर्श बिंदु पर त्रिज्या लंबवत होती है, बाह्य बिंदु से स्पर्श रेखाओं की समानता"),
        Chapter("c10_math_ch11", "c10_math", 11, "रचनाएँ", "Constructions", 8, "दिए गए अनुपात में रेखाखंड विभाजन, समरूप त्रिभुज की रचना, वृत्त पर स्पर्श रेखा युग्म खींचना"),
        Chapter("c10_math_ch12", "c10_math", 12, "वृत्तों से संबंधित क्षेत्रफल", "Areas Related to Circles", 10, "त्रिज्यखंड का क्षेत्रफल (θ/360° × πr²), वृत्तखंड का क्षेत्रफल, चाप की लंबाई, संयुक्त आकृतियाँ"),
        Chapter("c10_math_ch13", "c10_math", 13, "पृष्ठीय क्षेत्रफल और आयतन", "Surface Areas and Volumes", 12, "शंकु, बेलन, गोला, अर्धगोला, शंकु का छिन्नक, एक ठोस का दूसरे में रूपांतरण"),
        Chapter("c10_math_ch14", "c10_math", 14, "सांख्यिकी", "Statistics", 12, "वर्गीकृत आंकड़ों का माध्य (प्रत्यक्ष, पद-विचलन), बहुलक, माध्यक एवं तोरण"),
        Chapter("c10_math_ch15", "c10_math", 15, "प्रायिकता", "Probability", 8, "सैद्धांतिक प्रायिकता P(E) = अनुकूल परिणाम / कुल परिणाम, ताश की गड्डी, पासा, सिक्का"),

        // ==================== CLASS 10 SOCIAL SCIENCE (4 BOOKS - OLD NCERT) ====================
        // 1. History (इतिहास - भारत और समकालीन विश्व - II)
        Chapter("c10_sst_hist_ch1", "c10_sst_hist", 1, "यूरोप में राष्ट्रवाद का उदय", "The Rise of Nationalism in Europe", 6, "फ़्रांसीसी क्रांति और राष्ट्र का विचार, नेपोलियन की संहिता, जर्मनी और इटली का एकीकरण"),
        Chapter("c10_sst_hist_ch2", "c10_sst_hist", 2, "भारत में राष्ट्रवाद", "Nationalism in India", 10, "रौलट एक्ट, जलियांवाला बाग हत्याकांड, खिलाफत व असहयोग आंदोलन, चौरी-चौरा, सविनय अवज्ञा आंदोलन, दांडी मार्च"),
        Chapter("c10_sst_hist_ch3", "c10_sst_hist", 3, "भूमंडलीकृत विश्व का बनना", "The Making of a Global World", 6, "सिल्क रूट, रिंडरपेस्ट (मवेशी प्लेग), महामंदी (1929), ब्रेटन वुड्स संस्थाएँ (IMF व विश्व बैंक)"),
        Chapter("c10_sst_hist_ch4", "c10_sst_hist", 4, "औद्योगिकीकरण का युग", "The Age of Industrialisation", 5, "आदि-औद्योगिकीकरण, भाप का इंजन, गुमाश्ता, मैनचेस्टर का भारत में आगमन, भारतीय उद्यमी"),
        Chapter("c10_sst_hist_ch5", "c10_sst_hist", 5, "मुद्रण संस्कृति और आधुनिक दुनिया", "Print Culture & Modern World", 6, "गुटेनबर्ग और प्रिंटिंग प्रेस, मुद्रण क्रांति, भारत में पांडुलिपियाँ, मुद्रण और सुधार"),

        // 2. Geography (भूगोल - समकालीन भारत - II)
        Chapter("c10_sst_geo_ch1", "c10_sst_geo", 1, "संसाधन एवं विकास", "Resources and Development", 8, "संसाधनों का वर्गीकरण, सतत पोषणीय विकास, रियो पृथ्वी सम्मेलन, मृदा के प्रकार (जलोढ़, काली), मृदा अपरदन व संरक्षण"),
        Chapter("c10_sst_geo_ch2", "c10_sst_geo", 2, "वन एवं वन्यजीव संसाधन", "Forest and Wildlife Resources", 6, "जैव विविधता, आरक्षित व रक्षित वन, चिपको आंदोलन, संयुक्त वन प्रबंधन (JFM), प्रोजेक्ट टाइगर"),
        Chapter("c10_sst_geo_ch3", "c10_sst_geo", 3, "जल संसाधन", "Water Resources", 7, "जल दुर्लभता, बहुउद्देशीय नदी घाटी परियोजनाएं एवं उनके लाभ-हानि, नर्मदा बचाओ आंदोलन, वर्षा जल संचयन (खादिन, टांका)"),
        Chapter("c10_sst_geo_ch4", "c10_sst_geo", 4, "कृषि", "Agriculture", 8, "प्रारंभिक जीविका, गहन जीविका व वाणिज्यिक कृषि, सस्य प्रारूप (रबी, खरीफ, जायद), चावल, गेहूं, चाय, कपास की फसलें"),
        Chapter("c10_sst_geo_ch5", "c10_sst_geo", 5, "खनिज तथा ऊर्जा संसाधन", "Minerals and Energy Resources", 7, "खनिजों के प्रकार (धात्विक, अधात्विक), लौह अयस्क, बॉक्साइट, अभ्रक, परंपरागत ऊर्जा (कोयला, पेट्रोलियम) व गैर-परंपरागत"),
        Chapter("c10_sst_geo_ch6", "c10_sst_geo", 6, "विनिर्माण उद्योग", "Manufacturing Industries", 6, "उद्योगों का महत्त्व, कृषि आधारित उद्योग (सूती वस्त्र, चीनी), खनिज आधारित उद्योग (लोहा एवं इस्पात उद्योग), प्रदूषण नियंत्रण"),
        Chapter("c10_sst_geo_ch7", "c10_sst_geo", 7, "राष्ट्रीय अर्थव्यवस्था की जीवन रेखाएँ", "Lifelines of National Economy", 6, "परिवहन के साधन (सड़क, रेल, पाइपलाइन, जलमार्ग), प्रमुख समुद्री पत्तन, वायु परिवहन, अंतरराष्ट्रीय व्यापार एवं पर्यटन"),

        // 3. Civics (नागरिक शास्त्र - लोकतांत्रिक राजनीति - II)
        Chapter("c10_sst_civ_ch1", "c10_sst_civ", 1, "सत्ता की साझेदारी", "Power Sharing", 8, "बेल्जियम और श्रीलंका की जातीय बनावट, बेल्जियम मॉडल, श्रीलंका में बहुसंख्यकवाद, सत्ता की साझेदारी क्यों जरूरी है, सत्ता के रूप"),
        Chapter("c10_sst_civ_ch2", "c10_sst_civ", 2, "संघवाद", "Federalism", 8, "संघीय बनाम एकात्मक शासन, भारत में संघीय व्यवस्था (संघ, राज्य, समवर्ती सूची), भाषाई राज्य, पंचायती राज (73वां संशोधन)"),
        Chapter("c10_sst_civ_ch3", "c10_sst_civ", 3, "लोकतंत्र और विविधता", "Democracy and Diversity", 5, "मेक्सिको ओलंपिक (1968) नागरिक अधिकार आंदोलन, सामाजिक भेदभाव की उत्पत्ति एवं विविधता का समावेशन"),
        Chapter("c10_sst_civ_ch4", "c10_sst_civ", 4, "जाति, धर्म और लैंगिक मसले", "Gender, Religion and Caste", 7, "लैंगिक विभाजन, महिलाओं का राजनीतिक प्रतिनिधित्व, धर्म व सांप्रदायिकता, धर्मनिरपेक्ष राज्य, राजनीति में जाति"),
        Chapter("c10_sst_civ_ch5", "c10_sst_civ", 5, "जन-संघर्ष और आंदोलन", "Popular Struggles & Movements", 5, "नेपाल में लोकतंत्र के लिए आंदोलन, बोलीविया का जल युद्ध, दबाव समूह और आंदोलन की भूमिका"),
        Chapter("c10_sst_civ_ch6", "c10_sst_civ", 6, "राजनीतिक दल", "Political Parties", 8, "राजनीतिक दलों की आवश्यकता व प्रमुख कार्य, दलीय व्यवस्था, राष्ट्रीय दल बनाम क्षेत्रीय दल, दलों के सामने चुनौतियाँ व सुधार"),
        Chapter("c10_sst_civ_ch7", "c10_sst_civ", 7, "लोकतंत्र के परिणाम", "Outcomes of Democracy", 6, "उत्तरदायी, जिम्मेवार और वैध शासन, आर्थिक संवृद्धि और विकास, असमानता और गरीबी में कमी, नागरिकों की गरिमा"),
        Chapter("c10_sst_civ_ch8", "c10_sst_civ", 8, "लोकतंत्र की चुनौतियाँ", "Challenges to Democracy", 5, "बुनियादी आधार बनाने की चुनौती, विस्तार की चुनौती, लोकतंत्र को मजबूत करने की चुनौती, राजनीतिक सुधार के उपाय"),

        // 4. Economics (अर्थशास्त्र - आर्थिक विकास की समझ)
        Chapter("c10_sst_eco_ch1", "c10_sst_eco", 1, "विकास", "Development", 7, "विकास के भिन्न-भिन्न लक्ष्य, राष्ट्रीय आय और प्रति व्यक्ति आय (औसत आय), विश्व बैंक रिपोर्ट, मानव विकास सूचकांक (HDI), धारणीयता"),
        Chapter("c10_sst_eco_ch2", "c10_sst_eco", 2, "भारतीय अर्थव्यवस्था के क्षेत्रक", "Sectors of the Indian Economy", 8, "प्राथमिक, द्वितीयक एवं तृतीयक क्षेत्रक, सकल घरेलू उत्पाद (GDP), तृतीयक क्षेत्रक का महत्त्व, प्रच्छन्न बेरोजगारी, मनरेगा (MGNREGA 2005)"),
        Chapter("c10_sst_eco_ch3", "c10_sst_eco", 3, "मुद्रा और साख", "Money and Credit", 8, "वस्तु विनिमय प्रणाली एवं आवश्यकताओं का दोहरा संयोग, मुद्रा के आधुनिक रूप, साख की शर्तें, औपचारिक व अनौपचारिक ऋण, स्वयं सहायता समूह (SHG)"),
        Chapter("c10_sst_eco_ch4", "c10_sst_eco", 4, "वैश्वीकरण और भारतीय अर्थव्यवस्था", "Globalisation & Indian Economy", 7, "विदेशी व्यापार, बहुराष्ट्रीय कंपनियाँ (MNCs), वैश्वीकरण के प्रेरक कारक (प्रौद्योगिकी, IT), विश्व व्यापार संगठन (WTO), विशेष आर्थिक क्षेत्र (SEZ)"),
        Chapter("c10_sst_eco_ch5", "c10_sst_eco", 5, "उपभोक्ता अधिकार", "Consumer Rights", 6, "उपभोक्ता शोषण के तरीके, उपभोक्ता संरक्षण अधिनियम (COPRA 1986), उपभोक्ता के 6 मूल अधिकार, जागो ग्राहक जागो, उपभोक्ता निवारण प्रक्रिया"),

        // ==================== CLASS 10 HINDI (2 BOOKS - OLD NCERT) ====================
        // 1. क्षितिज भाग - 2 (काव्य खंड एवं गद्य खंड - 17 अध्याय)
        Chapter("c10_hin_kshitij_ch1", "c10_hin_kshitij", 1, "पद (सूरदास)", "सूरदास के पद", 8, "गोपियों और उद्धव का संवाद, विरह व्यथा, योग साधना की तुलना कड़वी ककड़ी से, प्रेम की एकनिष्ठता"),
        Chapter("c10_hin_kshitij_ch2", "c10_hin_kshitij", 2, "राम-लक्ष्मण-परशुराम संवाद (तुलसीदास)", "राम-लक्ष्मण-परशुराम संवाद", 9, "धनुष भंग, परशुराम का क्रोध, लक्ष्मण के व्यंग्य बाण, राम की विनयशीलता"),
        Chapter("c10_hin_kshitij_ch3", "c10_hin_kshitij", 3, "सवैया और कवित्त (देव)", "सवैया और कवित्त", 6, "श्रीकृष्ण के रूप-सौंदर्य का चित्रण, वसंत रूपी बालक का वर्णन, चांदनी रात की सुंदरता"),
        Chapter("c10_hin_kshitij_ch4", "c10_hin_kshitij", 4, "आत्मकथ्य (जयशंकर प्रसाद)", "आत्मकथ्य", 7, "कवि द्वारा अपनी आत्मकथा न लिखने के कारण, जीवन की विडंबनाएँ, प्रिय की स्मृतियाँ"),
        Chapter("c10_hin_kshitij_ch5", "c10_hin_kshitij", 5, "उत्साह और अट नहीं रही है (सूर्यकांत त्रिपाठी 'निराला')", "उत्साह और अट नहीं रही है", 8, "बादल के माध्यम से क्रांति का आह्वान, नवजीवन की प्रेरणा, फागुन की मादक सुंदरता"),
        Chapter("c10_hin_kshitij_ch6", "c10_hin_kshitij", 6, "यह दंतुरित मुसकान और फसल (नागार्जुन)", "यह दंतुरित मुसकान और फसल", 7, "शिशु की मनमोहक मुसकान का प्रभाव, मधुपर्क, फसल का जादू, नदियों का पानी और किसानों का श्रम"),
        Chapter("c10_hin_kshitij_ch7", "c10_hin_kshitij", 7, "छाया मत छूना (गिरिजाकुमार माथुर)", "छाया मत छूना", 6, "बीते सुखद दिनों को याद न करने की सीख, वर्तमान का सामना, यथार्थ का पूजन"),
        Chapter("c10_hin_kshitij_ch8", "c10_hin_kshitij", 8, "कन्यादान (ऋतुराज)", "कन्यादान", 7, "माँ द्वारा बेटी को पारंपरिक सीमाओं से हटकर जीने की सीख, वस्त्र-आभूषण के बंधन से मुक्ति"),
        Chapter("c10_hin_kshitij_ch9", "c10_hin_kshitij", 9, "संगतकार (मंगलेश डबराल)", "संगतकार", 6, "मुख्य गायक का साथ देने वाले संगतकार का त्याग, मानवीयता और पृष्ठभूमि के कलाकारों का महत्त्व"),
        Chapter("c10_hin_kshitij_ch10", "c10_hin_kshitij", 10, "नेताजी का चश्मा (स्वयं प्रकाश)", "नेताजी का चश्मा", 8, "कैप्टन चश्मेवाले की देशभक्ति, नेताजी सुभाष चंद्र बोस की मूर्ति, हालदार साहब और पानवाले का दृष्टिकोण"),
        Chapter("c10_hin_kshitij_ch11", "c10_hin_kshitij", 11, "बालगोबिन भगत (रामवृक्ष बेनीपुरी)", "बालगोबिन भगत", 8, "भगत जी का कबीरपंथी सादगीपूर्ण जीवन, पुत्र की मृत्यु पर उत्सव, बहू का पुनर्विवाह, सामाजिक कुरीतियों का विरोध"),
        Chapter("c10_hin_kshitij_ch12", "c10_hin_kshitij", 12, "लखनवी अंदाज़ (यशपाल)", "लखनवी अंदाज़", 7, "नवाब साहब का बनावटी जीवन, खीरे का सूंघकर फेंकना, सामंती सोच पर तीखा व्यंग्य, नई कहानी की सार्थकता"),
        Chapter("c10_hin_kshitij_ch13", "c10_hin_kshitij", 13, "मानवीय करुणा की दिव्य चमक (सर्वेश्वर दयाल सक्सेना)", "मानवीय करुणा की दिव्य चमक", 7, "फादर कामिल बुल्के का व्यक्तित्व, हिंदी प्रेम, 'परिमल' संस्था, संन्यास की भारतीय परिभाषा"),
        Chapter("c10_hin_kshitij_ch14", "c10_hin_kshitij", 14, "एक कहानी यह भी (मन्नू भंडारी)", "एक कहानी यह भी", 7, "लेखिका का बचपन, पिता का प्रभाव, प्राध्यापिका शीला अग्रवाल की प्रेरणा, स्वाधीनता आंदोलन में भागीदारी"),
        Chapter("c10_hin_kshitij_ch15", "c10_hin_kshitij", 15, "स्त्री-शिक्षा के विरोधी कुतर्कों का खंडन (महावीर प्रसाद द्विवेदी)", "स्त्री-शिक्षा के विरोधी कुतर्कों का खंडन", 6, "प्राचीन विदुषी स्त्रियों (गार्गी, मैत्रेयी) के उदाहरण, स्त्री शिक्षा की अनिवार्यता, रूढ़िवादी सोच पर प्रहार"),
        Chapter("c10_hin_kshitij_ch16", "c10_hin_kshitij", 16, "नौबतखाने में इबादत (यतीन्द्र मिश्र)", "नौबतखाने में इबादत", 7, "उस्ताद बिस्मिल्ला खाँ की शहनाई साधना, काशी की गंगा-जमुनी संस्कृति, संगीत व धर्म का समन्वय"),
        Chapter("c10_hin_kshitij_ch17", "c10_hin_kshitij", 17, "संस्कृति (भदंत आनंद कौसल्यायन)", "संस्कृति", 6, "सभ्यता और संस्कृति में अंतर, न्यूटन की खोज और संस्कृति, मानवता के कल्याण की भावना"),

        // 2. कृतिका भाग - 2 (पूरक पाठ्यपुस्तक - 5 अध्याय)
        Chapter("c10_hin_kritika_ch1", "c10_hin_kritika", 1, "माता का अँचल (शिवपूजन सहाय)", "माता का अँचल", 8, "देहाती बचपन, पिता के साथ खेल, विपत्ति में माता के आँचल में शरण, वात्सल्य रस"),
        Chapter("c10_hin_kritika_ch2", "c10_hin_kritika", 2, "जॉर्ज पंचम की नाक (कमलेश्वर)", "जॉर्ज पंचम की नाक", 8, "रानी एलिज़ाबेथ के आगमन पर दिल्ली का कायाकल्प, सरकारी तंत्र की चाटुकारिता व औपनिवेशिक मानसिकता पर व्यंग्य"),
        Chapter("c10_hin_kritika_ch3", "c10_hin_kritika", 3, "साना-साना हाथ जोड़ि... (मधु कांकरिया)", "साना-साना हाथ जोड़ि...", 8, "सिक्किम, गंगटोक और हिमालय की यात्रा, जितेन नार्गे की गाइड भूमिका, पहाड़ी स्त्रियों का कठिन परिश्रम, प्राकृतिक सौंदर्य"),
        Chapter("c10_hin_kritika_ch4", "c10_hin_kritika", 4, "एही ठैयाँ झुलनी हेरानी हो रामा! (शिवप्रसाद मिश्र 'रुद्र')", "एही ठैयाँ झुलनी हेरानी हो रामा!", 7, "दुलारी और टुन्नू का प्रेम, देशभक्ति, विदेशी वस्त्रों का बहिष्कार, स्वतंत्रता संग्राम में बलिदान"),
        Chapter("c10_hin_kritika_ch5", "c10_hin_kritika", 5, "मैं क्यों लिखता हूँ? (अज्ञेय)", "मैं क्यों लिखता हूँ?", 7, "लेखन की आंतरिक विवशता, हिरोशिमा का परमाणु विस्फोट, पत्थर पर उकेरी गई मानव छाया, प्रत्यक्ष अनुभूति"),

        // ==================== CLASS 10 ENGLISH (2 BOOKS - OLD NCERT) ====================
        // 1. First Flight (मुख्य पाठ्यपुस्तक - 11 अध्याय)
        Chapter("c10_eng_ff_ch1", "c10_eng_first_flight", 1, "भगवान के नाम एक पत्र (A Letter to God)", "भगवान के नाम एक पत्र", 8, "लेंचो का अटूट ईश्वर विश्वास, ओलावृष्टि की तबाही, 70 पेसो की सहायता, डाकपाल की उदारता"),
        Chapter("c10_eng_ff_ch2", "c10_eng_first_flight", 2, "नेल्सन मंडेला: स्वतंत्रता की लंबी यात्रा (Nelson Mandela)", "नेल्सन मंडेला: स्वतंत्रता की लंबी यात्रा", 8, "रंगभेद नीति का अंत, दक्षिण अफ्रीका के पहले अश्वेत राष्ट्रपति, साहस की परिभाषा, दोहरे दायित्व"),
        Chapter("c10_eng_ff_ch3", "c10_eng_first_flight", 3, "उड़ान के बारे में दो कहानियाँ (Two Stories about Flying)", "उड़ान के बारे में दो कहानियाँ", 8, "I. उसकी पहली उड़ान (समुद्री पक्षी का डर व उड़ान) एवं II. काला हवाई जहाज (रहस्यमयी पायलट)"),
        Chapter("c10_eng_ff_ch4", "c10_eng_first_flight", 4, "ऐनी फ्रैंक की डायरी से (From the Diary of Anne Frank)", "ऐनी फ्रैंक की डायरी से", 7, "डायरी 'किट्टी', गुप्त तहखाने का जीवन, मिस्टर कीसिंग की गणित कक्षा, बातूनी छात्रा पर निबंध"),
        Chapter("c10_eng_ff_ch5", "c10_eng_first_flight", 5, "सौ पोशाकें - भाग 1 (The Hundred Dresses - I)", "सौ पोशाकें - भाग 1", 7, "वांडा पेट्रोन्स्की का साधारण जीवन, पेगी और मैडी द्वारा चिढ़ाना, ड्राइंग प्रतियोगिता में सौ डिजाइनों की जीत"),
        Chapter("c10_eng_ff_ch6", "c10_eng_first_flight", 6, "सौ पोशाकें - भाग 2 (The Hundred Dresses - II)", "सौ पोशाकें - भाग 2", 7, "वांडा के पिता का पत्र, शहर छोड़ना, मैडी का पश्चाताप, वांडा का उपहार और क्षमाशीलता"),
        Chapter("c10_eng_ff_ch7", "c10_eng_first_flight", 7, "भारत की झलकियाँ (Glimpses of India)", "भारत की झलकियाँ", 8, "I. गोवा का एक बेकर (पादेर), II. कूर्ग (कॉफ़ी की धरती और वीर सैनिक), III. असम की चाय (राजवीर और प्रांजोल)"),
        Chapter("c10_eng_ff_ch8", "c10_eng_first_flight", 8, "मिजबिल: एक ऊदबिलाव (Mijbil the Otter)", "मिजबिल: एक ऊदबिलाव", 6, "कमिस्फर्ना से लंदन की यात्रा, हवाई जहाज में मिजबिल की शरारतें, लंदनवासियों के विचित्र अनुमान"),
        Chapter("c10_eng_ff_ch9", "c10_eng_first_flight", 9, "मैडम बस की सवारी करती हैं (Madam Rides the Bus)", "मैडम बस की सवारी करती हैं", 8, "8 वर्षीय वल्ली की बस यात्रा की लालसा, पैसे बचाना, शहर का रोमांच, मृत गाय से जीवन-मृत्यु का सत्य"),
        Chapter("c10_eng_ff_ch10", "c10_eng_first_flight", 10, "बनारस में उपदेश (The Sermon at Benares)", "बनारस में उपदेश", 8, "गौतम बुद्ध का पहला उपदेश, किसा गौतमी के मृत पुत्र की कथा, सरसों के दाने की खोज, मृत्यु की सार्वभौमिकता"),
        Chapter("c10_eng_ff_ch11", "c10_eng_first_flight", 11, "विवाह का प्रस्ताव (The Proposal - नाटक)", "विवाह का प्रस्ताव", 7, "लोमोव, चुबुकोव और नताल्या का प्रहसन, ऑक्सेन मीडोज और शिकारी कुत्तों (गेस व स्क्वीजर) पर हास्यास्पद झगड़े"),

        // 2. Footprints Without Feet (पूरक पाठ्यपुस्तक - 10 अध्याय)
        Chapter("c10_eng_fp_ch1", "c10_eng_footprints", 1, "सर्जरी की विजय (A Triumph of Surgery)", "सर्जरी की विजय", 8, "मिसेज पम्फ्री का लाड़-प्यार, मोटे कुत्ते ट्रिकी की बीमारी, डॉ. जेम्स हेरियट द्वारा बिना दवा केवल व्यायाम से इलाज"),
        Chapter("c10_eng_fp_ch2", "c10_eng_footprints", 2, "चोर की कहानी (The Thief's Story)", "चोर की कहानी", 8, "15 वर्षीय चोर हरि सिंह, अनिल का विश्वास, 600 रुपये की चोरी, अंतरात्मा की आवाज और शिक्षा का महत्व"),
        Chapter("c10_eng_fp_ch3", "c10_eng_footprints", 3, "आधी रात का आगंतुक (The Midnight Visitor)", "आधी रात का आगंतुक", 7, "गुप्त जासूस ऑसेबल, लेखक फाउलर, प्रतिद्वंद्वी जासूस मैक्स, बालकनी की चतुर काल्पनिक कहानी से विजय"),
        Chapter("c10_eng_fp_ch4", "c10_eng_footprints", 4, "विश्वास का प्रश्न (A Question of Trust)", "विश्वास का प्रश्न", 7, "होरेस डैनबी की दुर्लभ पुस्तकों का शौक, शॉटओवर ग्रेंज में चोरी, लाल पोशाक वाली चालाक महिला चोर द्वारा धोखा"),
        Chapter("c10_eng_fp_ch5", "c10_eng_footprints", 5, "बिना पैरों के पदचिह्न (Footprints Without Feet)", "बिना पैरों के पदचिह्न", 8, "अदृश्य वैज्ञानिक ग्रिफिन, लंदन स्टोर में चोरी, इपिंग गांव की सराय में मिसेज हॉल पर हमला, कानून से भागना"),
        Chapter("c10_eng_fp_ch6", "c10_eng_footprints", 6, "एक वैज्ञानिक का निर्माण (The Making of a Scientist)", "एक वैज्ञानिक का निर्माण", 7, "रिचर्ड एब्राइट का तितली संग्रह, 'द ट्रैवल्स ऑफ मोनार्क X', डीएनए व कोशिकाओं की खोज, मां का योगदान"),
        Chapter("c10_eng_fp_ch7", "c10_eng_footprints", 7, "हार (The Necklace)", "हार", 8, "मटिल्डा लोइसेल की झूठी शान, मंत्री के समारोह के लिए हीरों का हार उधार लेना, हार खोना, 10 साल की गुलामी, नकली हार का सच"),
        Chapter("c10_eng_fp_ch8", "c10_eng_footprints", 8, "गाड़ीवान (The Hack Driver)", "गाड़ीवान", 7, "युवा वकील की न्यू मुलियन यात्रा, ओलिवर लुटकिन्स को समन तामील करना, बिल मैगनसन (खुद लुटकिन्स) द्वारा मूर्ख बनाना"),
        Chapter("c10_eng_fp_ch9", "c10_eng_footprints", 9, "भोली (Bholi)", "भोली", 8, "सुलेखा (भोली) का बचपन, चेचक के दाग, तुतलाना, अध्यापिका की प्रेरणा, बिशंबरनाथ के दहेज का विरोध, स्वाभिमानी नारी"),
        Chapter("c10_eng_fp_ch10", "c10_eng_footprints", 10, "वह पुस्तक जिसने पृथ्वी को बचाया (The Book that Saved the Earth)", "वह पुस्तक जिसने पृथ्वी को बचाया", 7, "25वीं सदी का नाटक, मंगल ग्रह के थिंक-टैंक का पृथ्वी पर आक्रमण का विचार, 'मदर गूज' नर्सरी राइम्स की किताब से डरकर भागना"),

        // Class 12 Physics Chapters
        Chapter("c12_phy_ch1", "c12_phy", 1, "Electric Charges & Fields", "वैद्युत आवेश तथा क्षेत्र", 12, "Coulomb's Law, Electric Dipole, Gauss's Theorem and applications"),
        Chapter("c12_phy_ch2", "c12_phy", 2, "Electrostatic Potential & Capacitance", "स्थिरवैद्युत विभव तथा धारिता", 10, "Equipotential surfaces, parallel plate capacitor, energy stored"),
        Chapter("c12_phy_ch3", "c12_phy", 3, "Current Electricity", "विद्युत धारा", 14, "Ohm's Law, drift velocity, Kirchhoff's Laws, Wheatstone bridge"),
        Chapter("c12_phy_ch9", "c12_phy", 9, "Ray Optics & Optical Instruments", "किरण प्रकाशिकी एवं प्रकाशिक यंत्र", 12, "Lens maker formula, prism dispersion, astronomical telescope, compound microscope"),
        Chapter("c12_phy_ch14", "c12_phy", 14, "Semiconductor Electronics", "अर्धचालक इलेक्ट्रॉनिकी", 9, "p-n junction diode, full wave rectifier, energy bands in solids"),

        // Class 12 Chemistry Chapters
        Chapter("c12_chem_ch1", "c12_chem", 1, "Solutions", "विलयन", 11, "Raoult's Law, Colligative properties, Elevation in boiling point, Osmotic pressure"),
        Chapter("c12_chem_ch2", "c12_chem", 2, "Electrochemistry", "विद्युतरसायन", 10, "Nernst equation, Kohlrausch's law, Faraday's laws, Galvanic cells"),
        Chapter("c12_chem_ch3", "c12_chem", 3, "Chemical Kinetics", "रासायनिक बलगतिकी", 9, "Rate law, order vs molecularity, zero and first order integrated rate laws"),
        Chapter("c12_chem_ch6", "c12_chem", 6, "Haloalkanes and Haloarenes", "हैलोऐल्केन तथा हैलोऐरीन", 10, "SN1 and SN2 mechanisms, Wurtz-Fittig reaction, elimination reactions"),
        Chapter("c12_chem_ch7", "c12_chem", 7, "Aldehydes, Ketones & Carboxylic Acids", "ऐल्डिहाइड, कीटोन एवं कार्बोक्सिलिक अम्ल", 12, "Cannizzaro, Aldol condensation, Clemmensen, Tollens test"),

        // Class 12 Mathematics Chapters
        Chapter("c12_math_ch1", "c12_math", 1, "Relations and Functions", "संबंध एवं फलन", 8, "Equivalence relation, one-one and onto functions"),
        Chapter("c12_math_ch3", "c12_math", 3, "Matrices and Determinants", "आव्यूह एवं सारणिक", 11, "Inverse of matrix, solving system of linear equations using matrix method"),
        Chapter("c12_math_ch5", "c12_math", 5, "Continuity & Differentiability", "सांतत्य तथा अवकलनीयता", 10, "Chain rule, logarithmic differentiation, Rolle's and Mean Value Theorem"),
        Chapter("c12_math_ch7", "c12_math", 7, "Integrals", "समाकलन", 14, "Integration by substitution, by parts, partial fractions, definite integral properties"),

        // Class 12 Biology Chapters
        Chapter("c12_bio_ch1", "c12_bio", 1, "Sexual Reprod. in Flowering Plants", "पुष्पी पादपों में लैंगिक जनन", 9, "Microsporogenesis, megasporogenesis, double fertilization, endosperm development"),
        Chapter("c12_bio_ch2", "c12_bio", 2, "Human Reproduction", "मानव जनन", 10, "Male/Female reproductive system, Spermatogenesis, Oogenesis, Menstrual cycle"),
        Chapter("c12_bio_ch3", "c12_bio", 3, "Principles of Inheritance", "वंशागति तथा विविधता के सिद्धांत", 11, "Mendel's laws, Dihybrid cross, Sex determination, Hemophilia, Sickle cell anemia"),

        // Class 12 Economics Chapters (Science Stream)
        Chapter("c12_econ_ch1", "c12_econ", 1, "Introduction to Microeconomics", "व्यष्टि अर्थशास्त्र एक परिचय", 10, "Central problems of an economy, Production Possibility Curve (PPC), Opportunity cost"),
        Chapter("c12_econ_ch2", "c12_econ", 2, "Theory of Consumer Behaviour", "उपभोक्ता के व्यवहार का सिद्धांत", 12, "Law of Diminishing Marginal Utility, Indifference curve, Consumer equilibrium, Law of Demand"),
        Chapter("c12_econ_ch3", "c12_econ", 3, "National Income Accounting", "राष्ट्रीय आय का लेखांकन", 12, "GDP, GNP, NNP, Circular flow of income, Methods of calculation (Value Added, Expenditure, Income)"),
        Chapter("c12_econ_ch4", "c12_econ", 4, "Money and Banking", "मुद्रा और बैंकिंग", 10, "Functions of money, Commercial banks credit creation, Central Bank (RBI) monetary tools (CRR, SLR, Repo)"),
        Chapter("c12_econ_ch5", "c12_econ", 5, "Government Budget and Economy", "सरकारी बजट एवं अर्थव्यवस्था", 9, "Revenue vs Capital budget, Fiscal deficit, Revenue deficit, Objectives of government budget"),

        // Class 12 Computer Science Chapters (Science Stream)
        Chapter("c12_cs_ch1", "c12_cs", 1, "OOPs Concepts & C++", "ऑब्जेक्ट ओरिएंटेड प्रोग्रामिंग एवं C++", 14, "Classes, Objects, Constructors, Destructors, Inheritance, Polymorphism & Encapsulation"),
        Chapter("c12_cs_ch2", "c12_cs", 2, "Data Structures (Stack & Queue)", "डेटा संरचनाएँ (स्टैक एवं कतार)", 12, "Array representation, Stack operations (PUSH, POP), Infix to Postfix conversion, Queue"),
        Chapter("c12_cs_ch3", "c12_cs", 3, "Database Management System & SQL", "डेटाबेस प्रबंधन एवं SQL", 12, "Relational data model, Primary Key, Candidate Key, Foreign Key, SQL DDL/DML commands"),
        Chapter("c12_cs_ch4", "c12_cs", 4, "Boolean Algebra & Logic Gates", "बूलियन बीजगणित एवं लॉजिक गेट्स", 10, "Basic logic gates (AND, OR, NOT, NAND, NOR, XOR), De Morgan's Laws, K-Map simplification"),
        Chapter("c12_cs_ch5", "c12_cs", 5, "Computer Networks & Security", "कंप्यूटर नेटवर्क एवं साइबर सुरक्षा", 10, "Network topologies (Star, Bus), Transmission media, OSI model, IP addressing, Cyber law & viruses")
    )

    val yearsList: List<ExamYear> = listOf(
        ExamYear(2024, "2024 (Latest JAC Exam)", 35, isLatest = true),
        ExamYear(2023, "2023 Board Exam", 32),
        ExamYear(2022, "2022 Term-1 & Term-2", 30),
        ExamYear(2020, "2020 Annual Exam", 28),
        ExamYear(2019, "2019 Annual Exam", 25),
        ExamYear(2018, "2018 Annual Exam", 22)
    )

    // AUTHENTIC JAC BOARD PREVIOUS YEAR QUESTIONS WITH DETAILED SOLUTIONS
    val questions: List<PyqQuestion> = listOf(
        // ==================== CLASS 10 SCIENCE (OLD NCERT 16 CHAPTERS) ====================
        PyqQuestion(
            id = "q_10_sci_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch1",
            chapterName = "रासायनिक अभिक्रियाएँ एवं समीकरण",
            year = 2024,
            questionNo = 1,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "दानेदार जस्ता (Zn) पर तनु सल्फ्यूरिक अम्ल (H2SO4) डालने पर कौन सी गैस उत्सर्जित होती है?",
            questionEnglish = "Which gas is evolved when dilute sulphuric acid is added to granulated zinc?",
            options = listOf("ऑक्सीजन (O2)", "हाइड्रोजन (H2)", "नाइट्रोजन (N2)", "सल्फर डाइऑक्साइड (SO2)"),
            correctOptionIndex = 1,
            answerHindi = "सही उत्तर: (B) हाइड्रोजन (H2)\nजब जस्ता तनु सल्फ्यूरिक अम्ल के साथ अभिक्रिया करता है, तो जिंक सल्फेट और हाइड्रोजन गैस बनती है।\nZn (s) + H2SO4 (aq) → ZnSO4 (aq) + H2 (g)↑",
            answerEnglish = "Correct Answer: (B) Hydrogen (H2)\nWhen zinc reacts with dilute sulphuric acid, zinc sulphate is formed along with the liberation of hydrogen gas.\nZn (s) + H2SO4 (aq) → ZnSO4 (aq) + H2 (g)↑",
            solutionSteps = listOf(
                "धातु (Zn) + तनु अम्ल (H2SO4) → लवण (ZnSO4) + हाइड्रोजन गैस (H2)",
                "हाइड्रोजन गैस की पहचान जलती हुई तीली ले जाने पर 'पॉप' (pop sound) ध्वनि से होती है।"
            ),
            keyFormulasOrPoints = listOf("Zn + H2SO4 → ZnSO4 + H2↑", "Pop test for hydrogen gas"),
            examTip = "JAC बोर्ड में हर साल किसी धातु और अम्ल की अभिक्रिया पर 1 अंक का बहुविकल्पीय प्रश्न पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch1",
            chapterName = "रासायनिक अभिक्रियाएँ एवं समीकरण",
            year = 2024,
            questionNo = 15,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "संयोजन अभिक्रिया और वियोजन अभिक्रिया में क्या अंतर है? प्रत्येक का एक-एक संतुलित रासायनिक समीकरण लिखिए।",
            questionEnglish = "What is the difference between a combination reaction and a decomposition reaction? Write one balanced chemical equation for each.",
            answerHindi = "1. संयोजन अभिक्रिया (Combination Reaction):\nऐसी अभिक्रिया जिसमें दो या दो से अधिक अभिकारक मिलकर एक एकल उत्पाद का निर्माण करते हैं।\nउदाहरण: कोयले का दहन:\nC(s) + O2(g) → CO2(g)\n\n2. वियोजन अभिक्रिया (Decomposition Reaction):\nऐसी अभिक्रिया जिसमें एक एकल अभिकारक टूटकर दो या दो से अधिक सरल उत्पाद बनाता है।\nउदाहरण: कैल्शियम कार्बोनेट का ऊष्मीय वियोजन:\nCaCO3(s) --(ऊष्मा)--> CaO(s) + CO2(g)",
            answerEnglish = "1. Combination Reaction:\nA reaction in which two or more reactants combine to form a single product is called a combination reaction.\nExample: Burning of coal: C(s) + O2(g) → CO2(g)\n\n2. Decomposition Reaction:\nA reaction in which a single reactant breaks down to yield two or more simpler products.\nExample: Thermal decomposition of limestone: CaCO3(s) --(Heat)--> CaO(s) + CO2(g)",
            solutionSteps = listOf(
                "संयोजन में अभिकारक जुड़कर 1 उत्पाद बनाते हैं (A + B → AB)",
                "वियोजन संयोजन का विपरीत होता है (AB → A + B)",
                "संतुलित समीकरण और अवस्था (s, l, g, aq) लिखना अनिवार्य है।"
            ),
            keyFormulasOrPoints = listOf("संयोजन: C + O2 → CO2", "वियोजन: CaCO3 → CaO + CO2"),
            examTip = "वियोजन अभिक्रिया को संयोजन अभिक्रिया का विपरीत क्यों कहा जाता है, यह प्रश्न बार-बार दोहराया जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2023_ch2_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch2",
            chapterName = "अम्ल, क्षारक एवं लवण",
            year = 2023,
            questionNo = 11,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "प्लास्टर ऑफ पेरिस (POP) का रासायनिक सूत्र एवं निर्माण विधि लिखिए। इसे आर्द्र-रोधी बर्तन में क्यों रखा जाना चाहिए?",
            questionEnglish = "Write the chemical formula and method of preparation of Plaster of Paris. Why should it be stored in a moisture-proof container?",
            answerHindi = "1. रासायनिक नाम एवं सूत्र:\nकैल्शियम सल्फेट हेमीहाइड्रेट (CaSO4·½H2O)\n\n2. निर्माण विधि:\nजब जिप्सम (CaSO4·2H2O) को 373 K (100°C) पर गर्म किया जाता है, तो यह जल के अणुओं का त्याग कर प्लास्टर ऑफ पेरिस बनाता है:\nCaSO4·2H2O --(373 K)--> CaSO4·½H2O + 1½ H2O\n\n3. आर्द्र-रोधी बर्तन में रखने का कारण:\nप्लास्टर ऑफ पेरिस नमी (आर्द्रता) सोखकर पुनः कठोर जिप्सम में बदल जाता है और बेकार हो जाता है:\nCaSO4·½H2O + 1½ H2O → CaSO4·2H2O (कठोर जिप्सम)",
            answerEnglish = "1. Formula: CaSO4·½H2O (Calcium sulphate hemihydrate)\n2. Preparation: Heating gypsum at 373 K: CaSO4·2H2O → CaSO4·½H2O + 1½ H2O\n3. Reason: In presence of moisture, POP sets into a hard solid mass (gypsum), losing its setting property.",
            solutionSteps = listOf(
                "POP सूत्र: CaSO4·½H2O",
                "जिप्सम को 373 K (100°C) पर गर्म करके बनाया जाता है",
                "नमी से बचाने के लिए एयरटाइट बर्तन में रखते हैं।"
            ),
            keyFormulasOrPoints = listOf("CaSO4·½H2O", "तापमान 373 K नियंत्रित रखना आवश्यक"),
            examTip = "प्लास्टर ऑफ पेरिस के दो उपयोग: टूटी हड्डियों को बैठाने में तथा मूर्तियाँ व खिलौने बनाने में।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_ch3_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch3",
            chapterName = "धातु एवं अधातु",
            year = 2024,
            questionNo = 8,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "आयनिक यौगिकों के गलनांक एवं क्वथनांक उच्च क्यों होते हैं? सोडियम क्लोराइड (NaCl) के निर्माण का इलेक्ट्रॉन बिंदु आरेख बनाइए।",
            questionEnglish = "Why do ionic compounds have high melting and boiling points? Show the formation of sodium chloride (NaCl) by the transfer of electrons.",
            answerHindi = "1. उच्च गलनांक का कारण:\nआयनिक यौगिकों में विपरीत आवेशित आयनों (धनायन और ऋणायन) के बीच बहुत मजबूत स्थिरवैद्युत आकर्षण बल (Strong Electrostatic Force) होता है। इस मजबूत अंतर-आयनिक आकर्षण को तोड़ने के लिए बहुत अधिक ऊष्मा ऊर्जा की आवश्यकता होती है।\n\n2. NaCl का निर्माण:\n• Na (2, 8, 1) → Na⁺ (2, 8) + e⁻\n• Cl (2, 8, 7) + e⁻ → Cl⁻ (2, 8, 8)\n• Na⁺ + Cl⁻ → [Na⁺][:Cl̈:⁻] → NaCl",
            answerEnglish = "1. High Melting Point: Due to strong inter-ionic electrostatic forces of attraction between positive and negative ions, a large amount of energy is required to break these bonds.\n2. Formation: Na loses 1 valence electron to become Na⁺, Cl gains this electron to become Cl⁻, forming stable NaCl lattice.",
            solutionSteps = listOf(
                "मजबूत स्थिरवैद्युत आकर्षण बल का उल्लेख करें।",
                "इलेक्ट्रॉन त्याग (Na → Na⁺) और ग्रहण (Cl → Cl⁻) दर्शाएं।",
                "अष्टक पूर्ण होने का नियम बताएं।"
            ),
            keyFormulasOrPoints = listOf("Strong electrostatic attraction", "Na: 2,8,1 → Na⁺: 2,8", "Cl: 2,8,7 → Cl⁻: 2,8,8"),
            examTip = "JAC बोर्ड में आयनिक यौगिकों के भौतिक गुणधर्म (कठोरता, गलनांक, विद्युत चालकता) पर प्रश्न अवश्य आता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2023_ch4_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch4",
            chapterName = "कार्बन एवं उसके यौगिक",
            year = 2023,
            questionNo = 16,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "समजातीय श्रेणी (Homologous Series) किसे कहते हैं? इसके कोई तीन प्रमुख लक्षण लिखिए। एथेनॉल और एथेनॉइक अम्ल में विभेद करने के लिए एक रासायनिक परीक्षण बताइए।",
            questionEnglish = "What is a homologous series? State any three characteristics. Describe one chemical test to distinguish between ethanol and ethanoic acid.",
            answerHindi = "1. समजातीय श्रेणी:\nयौगिकों की ऐसी श्रृंखला जिसमें एक ही प्रकार का प्रकार्यात्मक समूह कार्बन श्रृंखला में हाइड्रोजन को प्रतिस्थापित करता है।\nउदाहरण: ऐल्केन श्रेणी: CH4, C2H6, C3H8\n\n2. प्रमुख लक्षण:\n(i) उत्तरोत्तर सदस्यों के आण्विक सूत्र में -CH2- का अंतर होता है।\n(ii) आण्विक द्रव्यमान में 14 u का अंतर होता है।\n(iii) सभी सदस्यों के रासायनिक गुणधर्म समान होते हैं।\n\n3. विभेद परीक्षण (सोडियम बाइकार्बोनेट परीक्षण):\n• एथेनॉइक अम्ल (CH3COOH) में NaHCO3 डालने पर तीव्र बुदबुदाहट के साथ CO2 गैस निकलती है जो चूने के पानी को दूधिया कर देती है।\n• एथेनॉल (C2H5OH) सोडियम बाइकार्बोनेट के साथ कोई अभिक्रिया नहीं करता।",
            answerEnglish = "Homologous Series is a family of carbon compounds having the same functional group and similar chemical properties.\nCharacteristics: (i) Differ by -CH2- unit, (ii) Differ by 14u mass, (iii) Similar chemical properties.\nChemical Test: Sodium hydrogen carbonate test gives effervescence of CO2 with ethanoic acid, but no reaction with ethanol.",
            solutionSteps = listOf(
                "समजातीय श्रेणी की परिभाषा एवं उदाहरण लिखें।",
                "तीन लक्षण: -CH2- का अंतर, 14u द्रव्यमान अंतर, समान रासायनिक गुण।",
                "सोडियम बाइकार्बोनेट परीक्षण से विभेद स्पष्ट करें।"
            ),
            keyFormulasOrPoints = listOf("-CH2- difference", "14 atomic mass unit difference", "CH3COOH + NaHCO3 → CH3COONa + H2O + CO2↑"),
            examTip = "साबुन का मिसेल निर्माण और एस्टरीकरण अभिक्रिया भी इस अध्याय के बहुत महत्वपूर्ण प्रश्न हैं।"
        ),
        PyqQuestion(
            id = "q_10_sci_2022_ch5_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch5",
            chapterName = "तत्वों का आवर्त वर्गीकरण",
            year = 2022,
            questionNo = 10,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "आधुनिक आवर्त नियम क्या है? मेंडेलीफ की आवर्त सारणी और आधुनिक आवर्त सारणी में दो मुख्य अंतर लिखिए।",
            questionEnglish = "State Modern Periodic Law. Write two main differences between Mendeleev's Periodic Table and Modern Periodic Table.",
            answerHindi = "1. आधुनिक आवर्त नियम (हेनरी मोजले द्वारा 1913):\n\"तत्वों के भौतिक एवं रासायनिक गुणधर्म उनके परमाणु क्रमांकों (Atomic Numbers) के आवर्ती फलन होते हैं।\"\n\n2. मेंडेलीफ बनाम आधुनिक आवर्त सारणी:\n(i) आधार: मेंडेलीफ की सारणी परमाणु द्रव्यमान पर आधारित थी, जबकि आधुनिक सारणी परमाणु क्रमांक पर आधारित है।\n(ii) समस्थानिकों का स्थान: मेंडेलीफ सारणी में समस्थानिकों को स्थान नहीं मिल सका था, जबकि आधुनिक सारणी में समान परमाणु क्रमांक होने के कारण समस्थानिकों को एक ही स्थान मिला।\n(iii) कोबाल्ट और निकेल की विसंगति आधुनिक आवर्त सारणी में पूरी तरह सुलझ गई।",
            answerEnglish = "Modern Periodic Law states that properties of elements are periodic functions of their atomic numbers.\nDifferences: Mendeleev's was based on atomic masses, Modern on atomic numbers. Modern table easily accommodates isotopes.",
            solutionSteps = listOf(
                "आधुनिक आवर्त नियम: परमाणु क्रमांक का आवर्ती फलन।",
                "अंतर 1: परमाणु द्रव्यमान बनाम परमाणु क्रमांक।",
                "अंतर 2: समस्थानिकों की स्थिति।"
            ),
            keyFormulasOrPoints = listOf("Modern Periodic Law: Atomic number basis (Z)", "18 Groups, 7 Periods"),
            examTip = "आवर्त में बाएं से दाएं जाने पर परमाणु त्रिज्या घटती है और समूह में नीचे जाने पर बढ़ती है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_03",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch6",
            chapterName = "जैव प्रक्रम",
            year = 2024,
            questionNo = 18,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "मानव वृक्क (Kidney) में नेफ्रॉन (वृक्काणु) की संरचना तथा क्रियाविधि का सचित्र वर्णन कीजिए।",
            questionEnglish = "Describe the structure and functioning of a nephron in the human kidney with the help of a labeled diagram.",
            answerHindi = "नेफ्रॉन वृक्क की आधारभूत संरचनात्मक एवं क्रियात्मक इकाई है।\n\n1. संरचना:\n- बोमन संपुट (Bowman's Capsule): कप के आकार की थैली जिसमें कोशिकाओं का गुच्छा (केशिका गुच्छ या ग्लोमेरुलस) होता है।\n- वृक्क नलिका (Renal Tubule): समीपस्थ कुंडलित नलिका, हेनले का लूप और दूरस्थ कुंडलित नलिका।\n- संग्रह वाहिनी (Collecting Duct): छने हुए मूत्र को एकत्रित करती है।\n\n2. क्रियाविधि (मूत्र निर्माण के 3 चरण):\n(i) अतिसूक्ष्म निस्यंदन (Ultrafiltration): उच्च दाब के कारण रक्त से यूरिया, ग्लूकोज, लवण और जल बोमन संपुट में छन जाते हैं।\n(ii) चयनात्मक पुनरावशोषण (Selective Reabsorption): उपयोगी पदार्थ (ग्लूकोज, अमीनो अम्ल, जल) नलिका के चारों ओर स्थित केशिकाओं द्वारा पुनः अवशोषित हो जाते हैं।\n(iii) नलिका स्राव (Tubular Secretion): अवांछित आयन मूत्र में स्रावित होकर संग्रह वाहिनी में चले जाते हैं।",
            answerEnglish = "Nephron is the structural and functional filtration unit of the kidney.\n\n1. Structure:\n- Bowman's Capsule: A cup-shaped double-walled sac containing a cluster of capillaries called Glomerulus.\n- Tubular Region: Proximal Convoluted Tubule (PCT), Loop of Henle, and Distal Convoluted Tubule (DCT).\n- Collecting Duct: Receives urine from multiple nephrons.\n\n2. Functioning (Urine Formation Steps):\n(i) Ultrafiltration: High pressure in glomerulus forces water, urea, salts, and glucose into Bowman's capsule.\n(ii) Selective Reabsorption: Essential nutrients like glucose, amino acids, and water are reabsorbed into blood capillaries.\n(iii) Tubular Secretion: Extra ions and metabolic wastes are secreted into the tubule, forming urine.",
            solutionSteps = listOf(
                "नेफ्रॉन के मुख्य भाग: बोमन संपुट, केशिकागुच्छ, हेनले लूप, संग्रह वाहिनी।",
                "मूत्र निर्माण के तीन चरण: निस्यंदन, पुनरावशोषण, स्रावण।",
                "साफ नामांकित चित्र बनाएं।"
            ),
            keyFormulasOrPoints = listOf("Filtration unit: Nephron", "Ultrafiltration in Glomerulus", "Reabsorption of glucose and salts"),
            examTip = "JAC बोर्ड में नेफ्रॉन या मानव हृदय का चित्र अक्सर 5 अंक वाले सेक्शन में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_ch7_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch7",
            chapterName = "नियंत्रण एवं समन्वय",
            year = 2024,
            questionNo = 12,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "प्रतिवर्ती चाप (Reflex Arc) क्या है? किसी गर्म वस्तु को छूने पर हाथ का अचानक हटना किस प्रकार नियंत्रित होता है? आरेख द्वारा समझाइए।",
            questionEnglish = "What is a reflex arc? How is the sudden withdrawal of hand upon touching a hot object controlled? Explain with a diagram.",
            answerHindi = "1. प्रतिवर्ती क्रिया एवं प्रतिवर्ती चाप:\nकिसी उद्दीपन के प्रति अनैच्छिक एवं त्वरित अनुक्रिया को प्रतिवर्ती क्रिया कहते हैं। प्रतिवर्ती क्रिया में तंत्रिका आवेगों द्वारा तय किए गए मार्ग को प्रतिवर्ती चाप (Reflex Arc) कहते हैं।\n\n2. क्रिया का मार्ग (Pathway):\nग्राही अंग (त्वचा की ऊष्मा संवेदी कोशिकाएँ)\n   ↓ संवेदी तंत्रिका कोशिका (Sensory Neuron)\nमेरुरज्जु (Spinal Cord / Relay Neuron)\n   ↓ प्रेरक तंत्रिका कोशिका (Motor Neuron)\nकार्यकर अंग / पेशी (Effector / Muscle in arm) → हाथ पीछे खींचना।\n\nमेरुरज्जु त्वरित सुरक्षा के लिए इस क्रिया को मस्तिष्क तक संदेश पहुँचने से पहले ही संपन्न कर देता है।",
            answerEnglish = "Reflex Arc is the pathway taken by nerve impulses during a reflex action: Receptor (Skin) → Sensory Neuron → Spinal Cord (Interneuron) → Motor Neuron → Effector (Muscle).",
            solutionSteps = listOf(
                "प्रतिवर्ती क्रिया और प्रतिवर्ती चाप की परिभाषा।",
                "पाँच घटक: ग्राही, संवेदी तंत्रिका, मेरुरज्जु, प्रेरक तंत्रिका, कार्यकर पेशी।",
                "मेरुरज्जु द्वारा त्वरित नियंत्रण स्पष्ट करें।"
            ),
            keyFormulasOrPoints = listOf("Receptor → Sensory Neuron → Spinal Cord → Motor Neuron → Effector", "Unconscious rapid protective response"),
            examTip = "न्यूरॉन का नामांकित चित्र (द्रुमिका, कोशिकाकाय, तंत्रिकाक्ष/एक्सॉन) भी 3 अंक में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2023_ch8_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch8",
            chapterName = "जीव जनन कैसे करते हैं?",
            year = 2023,
            questionNo = 13,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "अमीबा में द्विखंडन (Binary Fission) की प्रक्रिया का सचित्र वर्णन कीजिए। मुकुलन और द्विखंडन में क्या अंतर है?",
            questionEnglish = "Describe the process of binary fission in Amoeba with diagrams. What is the difference between budding and binary fission?",
            answerHindi = "1. अमीबा में द्विखंडन:\nअमीबा एक एककोशिकीय जीव है जो अलैंगिक जनन की द्विखंडन विधि द्वारा जनन करता है:\n(i) केंद्रक का विभाजन (Karyokinesis): पहले अमीबा का केंद्रक लंबा होकर दो भागों में बंटता है।\n(ii) कोशिकाद्रव्य का विभाजन (Cytokinesis): फिर कोशिकाद्रव्य दो भागों में विभाजित हो जाता है।\n(iii) दो संतति अमीबा का निर्माण होता है।\n\n2. द्विखंडन बनाम मुकुलन:\n• द्विखंडन में जनक शरीर दो बराबर भागों में बंटता है और जनक का अस्तित्व समाप्त हो जाता है (जैसे अमीबा)।\n• मुकुलन में जनक के शरीर पर एक उभार (बड/मुकुल) निकलता है जो वृद्धि करके अलग हो जाता है और जनक शरीर यथावत रहता है (जैसे हाइड्रा, यीस्ट)।",
            answerEnglish = "Binary fission in Amoeba involves division of nucleus followed by division of cytoplasm resulting in two equal daughter cells. In budding, a small outgrowth forms on the parent body.",
            solutionSteps = listOf(
                "केंद्रक विभाजन (कैरियोकाइनेसिस) दर्शाएं।",
                "कोशिकाद्रव्य विभाजन (साइटोकाइनेसिस) दर्शाएं।",
                "द्विखंडन और मुकुलन का अंतर स्पष्ट करें।"
            ),
            keyFormulasOrPoints = listOf("Binary Fission: Parent splits into 2 equal parts", "Budding: Outgrowth on parent body"),
            examTip = "पुष्प की अनुदैर्ध्य काट (L.S. of Flower) का नामांकित चित्र भी JAC बोर्ड का पसंदीदा प्रश्न है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_ch9_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch9",
            chapterName = "आनुवंशिकता एवं जैव विकास",
            year = 2024,
            questionNo = 14,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "मानव में लिंग निर्धारण (Sex Determination) कैसे होता है? एक उपयुक्त आरेख बनाकर स्पष्ट कीजिए।",
            questionEnglish = "How is sex determined in human beings? Explain with the help of a suitable diagram.",
            answerHindi = "मानव में लिंग निर्धारण आनुवंशिक आधार पर होता है:\n1. मानव की प्रत्येक कोशिका में 23 जोड़े (46) गुणसूत्र होते हैं। इनमें से 22 जोड़े कायिक गुणसूत्र (ऑटोसोम) तथा 1 जोड़ा लिंग गुणसूत्र होता है।\n2. मादा (स्त्री) में लिंग गुणसूत्र XX होते हैं (सभी अंडाणु X गुणसूत्र वाले होते हैं)।\n3. नर (पुरुष) में लिंग गुणसूत्र XY होते हैं (50% शुक्राणु X गुणसूत्र वाले तथा 50% शुक्राणु Y गुणसूत्र वाले होते हैं)।\n\nनिषेचन क्रिया:\n• यदि X-अंडाणु का निषेचन X-शुक्राणु से होता है → XX युग्मनज (लड़की/पुत्री पैदा होगी)।\n• यदि X-अंडाणु का निषेचन Y-शुक्राणु से होता है → XY युग्मनज (लड़का/पुत्र पैदा होगा)।\n\nनिष्कर्ष: शिशु का लिंग पिता के शुक्राणु (X या Y) पर निर्भर करता है, माता पर नहीं।",
            answerEnglish = "Sex determination in humans is chromosomal: Females carry XX, males carry XY. When an egg (X) is fertilized by an X sperm, female offspring results. When fertilized by a Y sperm, male offspring results. Thus, father's sperm determines sex.",
            solutionSteps = listOf(
                "स्त्री: 44 + XX, पुरुष: 44 + XY",
                "युग्मक: अंडाणु केवल X, शुक्राणु X या Y",
                "पुनः संयोजन: XX = लड़की (50%), XY = लड़का (50%)",
                "स्पष्ट रेखाचित्र बनाएं।"
            ),
            keyFormulasOrPoints = listOf("Father (XY) + Mother (XX)", "50% Girl (XX), 50% Boy (XY)", "Paternal chromosome determines sex"),
            examTip = "मेंडल का एकसंकर संकरण (Monohybrid Cross 3:1 अनुपात) भी इसी अध्याय से बार-बार पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch10",
            chapterName = "प्रकाश – परावर्तन तथा अपवर्तन",
            year = 2023,
            questionNo = 12,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "प्रकाश के अपवर्तन के नियमों को लिखिए। स्नेल का नियम क्या है? अवतल दर्पण द्वारा बने प्रतिबिंब का किरण आरेख खींचिए जब वस्तु वक्रता केंद्र (C) और फोकस (F) के बीच स्थित हो।",
            questionEnglish = "State the laws of refraction of light. What is Snell's law? Draw a ray diagram showing the image formed by a concave mirror when an object is placed between the centre of curvature (C) and the principal focus (F).",
            answerHindi = "प्रकाश के अपवर्तन के दो नियम:\n1. आपतित किरण, अपवर्तित किरण तथा आपतन बिंदु पर अभिलंब तीनों एक ही तल में होते हैं।\n2. किन्हीं दो माध्यमों के युग्म के लिए आपतन कोण की ज्या (sin i) तथा अपवर्तन कोण की ज्या (sin r) का अनुपात स्थिर होता है। इसे स्नेल का नियम कहते हैं:\n   स्थिरांक = (sin i) / (sin r) = n21\n\nअवतल दर्पण द्वारा प्रतिबिंब की स्थिति (जब वस्तु C तथा F के बीच हो):\n• प्रतिबिंब की स्थिति: वक्रता केंद्र (C) से परे\n• प्रतिबिंब का आकार: वस्तु से बड़ा (विवर्धित)\n• प्रतिबिंब की प्रकृति: वास्तविक तथा उल्टा।",
            answerEnglish = "Laws of Refraction of Light:\n1. The incident ray, the refracted ray and the normal to the interface of two transparent media at the point of incidence, all lie in the same plane.\n2. The ratio of sine of angle of incidence to the sine of angle of refraction is a constant, for the light of a given colour and for the given pair of media (Snell's Law):\n   sin i / sin r = constant = n21\n\nImage formed by concave mirror when object is between C and F:\n- Position: Beyond C\n- Size: Enlarged / Magnified\n- Nature: Real and inverted",
            solutionSteps = listOf(
                "पहला नियम: आपतित किरण, अपवर्तित किरण और अभिलंब एक ही तल में।",
                "दूसरा नियम (स्नेल का नियम): sin i / sin r = स्थिर।",
                "किरण आरेख: मुख्य अक्ष के समांतर किरण फोकस (F) से गुजरेगी और फोकस से जाने वाली किरण मुख्य अक्ष के समांतर परावर्तित होगी, जो C से परे मिलेगी।"
            ),
            keyFormulasOrPoints = listOf("sin i / sin r = μ (अपवर्तनांक)", "वस्तु C व F के मध्य → प्रतिबिंब C से परे, वास्तविक, उल्टा व बड़ा"),
            examTip = "किरण आरेख में तीरों (arrows) की दिशा अवश्य दर्शाएं, अन्यथा अंक काटे जा सकते हैं।"
        ),
        PyqQuestion(
            id = "q_10_sci_2023_ch11_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch11",
            chapterName = "मानव नेत्र तथा रंगबिरंगा संसार",
            year = 2023,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "निकट दृष्टि दोष (मायोपिया) किसे कहते हैं? इसके उत्पन्न होने के दो कारण लिखिए। इसका निवारण किस लेंस द्वारा किया जाता है?",
            questionEnglish = "What is myopia (near-sightedness)? Write two causes of this defect. Which lens is used to correct it?",
            answerHindi = "1. परिभाषा:\nवह दृष्टि दोष जिसमें व्यक्ति पास की वस्तुओं को तो स्पष्ट देख सकता है, परंतु दूर की वस्तुओं को स्पष्ट नहीं देख पाता। इसमें दूर बिंदु अनंत पर न होकर पास आ जाता है।\n\n2. उत्पन्न होने के दो कारण:\n(i) नेत्र लेंस की वक्रता का अत्यधिक होना (फोकस दूरी कम हो जाना)।\n(ii) नेत्र गोलक का लंबा हो जाना।\n(परिणामस्वरूप दूर से आने वाली किरणों का प्रतिबिंब रेटिना से पहले ही बन जाता है)।\n\n3. निवारण:\nइस दोष के निवारण के लिए उपयुक्त फोकस दूरी वाले अवतल लेंस (Diverging/Concave Lens) का प्रयोग किया जाता है, जो किरणों को अपसारित करके प्रतिबिंब को ठीक रेटिना पर केंद्रित करता है।",
            answerEnglish = "Myopia is a defect where a person can see nearby objects clearly but cannot see distant objects distinctly. Causes: Excessive curvature of the eye lens or elongation of the eyeball. Correction: Using a concave lens of suitable focal length.",
            solutionSteps = listOf(
                "निकट दृष्टि दोष की परिभाषा।",
                "दो कारण: लेंस की वक्रता बढ़ना, गोलक लंबा होना।",
                "निवारण: अवतल लेंस (Concave Lens)।"
            ),
            keyFormulasOrPoints = listOf("Myopia → Concave Lens (अवतल लेंस)", "Hypermetropia → Convex Lens (उत्तल लेंस)"),
            examTip = "तारे क्यों टिमटिमाते हैं (वायुमंडलीय अपवर्तन) और आकाश का रंग नीला क्यों दिखाई देता है (प्रकाश का प्रकीर्णन) भी अति महत्वपूर्ण हैं।"
        ),
        PyqQuestion(
            id = "q_10_sci_2022_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch12",
            chapterName = "विद्युत",
            year = 2022,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "ओम का नियम क्या है? इसका गणितीय सूत्र लिखिए। प्रतिरोध का SI मात्रक क्या है?",
            questionEnglish = "State Ohm's law. Write its mathematical formula. What is the SI unit of resistance?",
            answerHindi = "ओम का नियम:\nयदि किसी चालक की भौतिक अवस्थाएँ (जैसे ताप, दाब आदि) स्थिर रहें, तो उसके सिरों के बीच लगाया गया विभवांतर (V) उसमें प्रवाहित होने वाली धारा (I) के समानुपाती होता है।\nगणितीय सूत्र: V ∝ I\nया V = I × R\nजहाँ R एक स्थिरांक है जिसे चालक का विद्युत प्रतिरोध (Resistance) कहते हैं।\nप्रतिरोध का SI मात्रक 'ओम' (Ω) है।",
            answerEnglish = "Ohm's Law:\nIf the physical conditions of a conductor (such as temperature) remain constant, the electric current flowing through it is directly proportional to the potential difference across its ends.\nMathematical expression: V ∝ I or V = I R\nwhere R is a constant of proportionality known as Resistance.\nThe SI unit of resistance is Ohm (Ω).",
            solutionSteps = listOf(
                "नियम का कथन (ताप स्थिर होना आवश्यक है)।",
                "सूत्र: V = IR",
                "SI मात्रक: ओम (Ohm - Ω)"
            ),
            keyFormulasOrPoints = listOf("V = IR", "1 Ohm = 1 Volt / 1 Ampere"),
            examTip = "अक्सर पूछा जाता है कि 1 ओम प्रतिरोध को परिभाषित कीजिए।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_ch13_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch13",
            chapterName = "विद्युत धारा के चुंबकीय प्रभाव",
            year = 2024,
            questionNo = 17,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "फ्लेमिंग का वाम-हस्त (बायां हाथ) नियम लिखिए। चुंबकीय क्षेत्र रेखाओं के कोई तीन प्रमुख गुण बताइए।",
            questionEnglish = "State Fleming's Left-Hand Rule. Write any three properties of magnetic field lines.",
            answerHindi = "1. फ्लेमिंग का वाम-हस्त नियम:\nअपने बाएं हाथ के अँगूठे, तर्जनी तथा मध्यमा को इस प्रकार फैलाएँ कि तीनों परस्पर एक-दूसरे के लंबवत् हों। तब:\n• तर्जनी (Forefinger) → चुंबकीय क्षेत्र (B) की दिशा को,\n• मध्यमा (Middle finger) → चालक में प्रवाहित धारा (I) की दिशा को दर्शाए,\n• तो अँगूठा (Thumb) → चालक पर लगने वाले बल (F) अथवा गति की दिशा को निरूपित करेगा।\n(उपयोग: विद्युत मोटर की कार्यप्रणाली में)।\n\n2. चुंबकीय क्षेत्र रेखाओं के तीन गुण:\n(i) ये चुंबक के उत्तरी ध्रुव (N) से निकलकर दक्षिणी ध्रुव (S) में प्रवेश करती हैं (और अंदर S से N की ओर बंद वक्र बनाती हैं)।\n(ii) दो चुंबकीय क्षेत्र रेखाएँ कभी भी एक-दूसरे को प्रतिच्छेद (काटती) नहीं करतीं।\n(iii) जहाँ क्षेत्र रेखाएँ पास-पास होती हैं, वहाँ चुंबकीय क्षेत्र अधिक प्रबल होता है।",
            answerEnglish = "Fleming's Left-Hand Rule: Stretch the thumb, forefinger and middle finger mutually perpendicular. Forefinger = Magnetic Field, Middle finger = Current, Thumb = Force/Motion.\nProperties: Continuous closed loops, never intersect each other, denser lines represent stronger magnetic field.",
            solutionSteps = listOf(
                "तीनों उँगलियों का परस्पर लंबवत होना बताएं।",
                "FBI सूत्र याद रखें: F=Force (Thumb), B=Field (Forefinger), I=Current (Middle finger)।",
                "प्रतिच्छेद न करने का कारण: एक बिंदु पर दो दिशाएं संभव नहीं हैं।"
            ),
            keyFormulasOrPoints = listOf("Thumb = Force (F)", "Forefinger = Magnetic Field (B)", "Middle finger = Current (I)"),
            examTip = "विद्युत मोटर का सिद्धांत (विद्युत ऊर्जा को यांत्रिक ऊर्जा में बदलना) भी बोर्ड परीक्षा में 5 अंक में आता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2022_ch14_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch14",
            chapterName = "ऊर्जा के स्रोत",
            year = 2022,
            questionNo = 8,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "ऊर्जा का एक उत्तम स्रोत किसे कहते हैं? सौर कुकर के उपयोग के दो लाभ एवं दो सीमाएं (हानियाँ) लिखिए।",
            questionEnglish = "What is a good source of energy? Write two advantages and two limitations of using a solar cooker.",
            answerHindi = "1. ऊर्जा के उत्तम स्रोत के लक्षण:\n• जो प्रति एकांक द्रव्यमान/आयतन अधिक कार्य (ऊष्मा) करे।\n• जो सरलता से उपलब्ध हो।\n• जिसका भंडारण और परिवहन आसान हो।\n• जो पर्यावरण को प्रदूषित न करे और सस्ता हो।\n\n2. सौर कुकर के लाभ:\n(i) यह पर्यावरण-हितैषी (प्रदूषण मुक्त) और पूर्णतः निःशुल्क ईंधन (सूर्य का प्रकाश) पर कार्य करता है।\n(ii) धीमी आंच पर पकने के कारण भोजन के पोषक तत्व सुरक्षित रहते हैं।\n\n3. सीमाएं (हानियाँ):\n(i) यह केवल धूप वाले दिनों में ही कार्य कर सकता है; रात में या बादलों वाले दिनों में भोजन नहीं पक सकता।\n(ii) इसमें भोजन तलने या रोटियाँ सेंकने का कार्य नहीं किया जा सकता।",
            answerEnglish = "A good source of energy does large work per unit volume/mass, is easily accessible, easy to store/transport, and is eco-friendly. Solar Cooker advantages: zero pollution, preserves nutrients. Limitations: cannot work at night or on cloudy days, cannot fry or bake.",
            solutionSteps = listOf(
                "उत्तम स्रोत के गुण: उच्च कैलोरी मान, सुलभता, प्रदूषण-मुक्त।",
                "सौर कुकर लाभ: निःशुल्क सौर ऊर्जा, पोषक तत्वों का संरक्षण।",
                "सौर कुकर हानियाँ: रात/बादल में अनुपयोगी, तलने योग्य नहीं।"
            ),
            keyFormulasOrPoints = listOf("High calorific value", "Clean & renewable energy", "Solar cooker uses greenhouse effect with glass sheet"),
            examTip = "बायोगैस (गोबर गैस) के मुख्य घटक (75% मीथेन) पर 1 अंक का प्रश्न पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2024_ch15_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch15",
            chapterName = "हमारा पर्यावरण",
            year = 2024,
            questionNo = 10,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "ओजोन परत क्या है तथा यह हमारे लिए क्यों आवश्यक है? ओजोन परत के क्षरण के क्या कारण हैं? इसे रोकने के उपाय बताइए।",
            questionEnglish = "What is ozone layer and why is it essential? What causes its depletion and how can it be prevented?",
            answerHindi = "1. ओजोन परत एवं महत्व:\nओजोन (O3) ऑक्सीजन के तीन परमाणुओं से मिलकर बना एक अणु है जो समताप मंडल (Stratosphere) में स्थित है। यह सूर्य से आने वाली हानिकारक पराबैंगनी किरणों (UV Rays) को अवशोषित कर पृथ्वी के जीवों की रक्षा करती है। UV किरणें त्वचा कैंसर, मोतियाबिंद तथा प्रतिरक्षा तंत्र को नुकसान पहुँचाती हैं।\n\n2. क्षरण के कारण:\nक्लोरोफ्लोरोकार्बन (CFCs), हैलोन आदि मानव-निर्मित रसायनों का अनियंत्रित उत्सर्जन जो रेफ्रिजरेटर, एसी और अग्निशामक यंत्रों में प्रशीतक के रूप में प्रयुक्त होते हैं।\n\n3. रोकथाम के उपाय:\n• CFCs के स्थान पर HFCs या पर्यावरण-अनुकूल विकल्पों का प्रयोग करना।\n• 1987 के मॉन्ट्रियल प्रोटोकॉल का कड़ाई से पालन करना।",
            answerEnglish = "Ozone layer (O3) protects life by absorbing lethal ultraviolet (UV) radiation from the sun. Depletion is primarily caused by chlorofluorocarbons (CFCs). Prevented by Montreal protocol banning CFC production.",
            solutionSteps = listOf(
                "ओजोन सूत्र: O3 (UV किरणों का अवशोषण)।",
                "हानि: त्वचा कैंसर, मोतियाबिंद।",
                "कारक: CFCs (क्लोरोफ्लोरोकार्बन)।"
            ),
            keyFormulasOrPoints = listOf("O2 + UV → O + O; O + O2 → O3", "CFCs cause ozone depletion", "Biological Magnification concept"),
            examTip = "आहार श्रृंखला में ऊर्जा प्रवाह का 10% नियम (लिंडमैन का नियम) भी इस अध्याय का बहुत प्रसिद्ध प्रश्न है।"
        ),
        PyqQuestion(
            id = "q_10_sci_2020_ch16_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sci",
            chapterId = "c10_sci_ch16",
            chapterName = "प्राकृतिक संसाधनों का संपोषित प्रबंधन",
            year = 2020,
            questionNo = 7,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "पर्यावरण संरक्षण के लिए '3 R' (कम उपयोग, पुनर्चक्रण, पुनः उपयोग) के नियम को उदाहरण सहित समझाइए। चिपको आंदोलन क्या था?",
            questionEnglish = "Explain the '3 R's' (Reduce, Recycle, Reuse) rule for protecting the environment with examples. What was the Chipko Movement?",
            answerHindi = "1. 3R का नियम:\n(i) कम उपयोग (Reduce): संसाधनों की बर्बादी को कम करना।\nउदाहरण: कमरे से निकलते समय बिजली के पंखे-बल्ब बंद करना, पानी के नल को टपकने से रोकना।\n(ii) पुनर्चक्रण (Recycle): उपयोग की गई वस्तुओं को गलाकर नया सामान बनाना।\nउदाहरण: पुराने प्लास्टिक, कांच और धातु के बर्तनों का पुनर्चक्रण करना।\n(iii) पुनः उपयोग (Reuse): वस्तुओं को फेंकने के बजाय बार-बार उपयोग करना। (यह पुनर्चक्रण से भी बेहतर है क्योंकि इसमें ऊर्जा खर्च नहीं होती)।\nउदाहरण: अचार या जैम के प्लास्टिक-कांच के डिब्बों का उपयोग दाल-मसाले रखने में करना।\n\n2. चिपको आंदोलन:\n1970 के दशक में उत्तराखंड के गढ़वाल के रेनी गाँव में पेड़ों की कटाई रोकने के लिए महिलाओं द्वारा शुरू किया गया ऐतिहासिक आंदोलन, जिसमें लोग पेड़ों से चिपक कर खड़े हो गए थे ताकि ठेकेदार उन्हें न काट सकें।",
            answerEnglish = "The 3R's are: Reduce (minimizing resource wastage), Recycle (processing waste into new products), Reuse (using items repeatedly). Chipko movement was a grassroots movement in 1970s where local women hugged trees to prevent deforestation.",
            solutionSteps = listOf(
                "Reduce (कम उपयोग) का अर्थ एवं उदाहरण।",
                "Recycle (पुनर्चक्रण) का अर्थ एवं उदाहरण।",
                "Reuse (पुनः उपयोग) का अर्थ एवं उदाहरण।",
                "चिपको आंदोलन: रेनी गाँव, उत्तराखंड, पेड़ों का संरक्षण।"
            ),
            keyFormulasOrPoints = listOf("Reduce, Recycle, Reuse", "Reuse is better than Recycle", "Chipko Movement: Forests conservation"),
            examTip = "वर्षा जल संचयन (Rainwater harvesting / खादिन / तालाब) पर भी प्रश्न पूछे जाते हैं।"
        ),

        // ==================== CLASS 10 MATHEMATICS (OLD NCERT 15 CHAPTERS) ====================
        PyqQuestion(
            id = "q_10_math_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch1",
            chapterName = "वास्तविक संख्याएँ",
            year = 2024,
            questionNo = 6,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "सिद्ध कीजिए कि √5 एक अपरिमेय संख्या है।",
            questionEnglish = "Prove that √5 is an irrational number.",
            answerHindi = "विरोधाभास विधि (Contradiction Method):\nमाना कि √5 एक परिमेय संख्या है।\nअतः हम दो सह-अभाज्य पूर्णांक a और b (जहाँ b ≠ 0 और HCF(a,b) = 1) प्राप्त कर सकते हैं कि:\n√5 = a / b\nदोनों पक्षों का वर्ग करने पर:\n5 = a² / b²  =>  a² = 5b² ... (समीकरण 1)\n\nयहाँ 5, a² को विभाजित करता है, अतः 5, a को भी विभाजित करेगा। (प्रमेय 1.3)\nमाना a = 5c (जहाँ c कोई पूर्णांक है)।\nसमीकरण (1) में a का मान रखने पर:\n(5c)² = 5b²  =>  25c² = 5b²  =>  b² = 5c² ... (समीकरण 2)\n\nयहाँ 5, b² को विभाजित करता है, अतः 5, b को भी विभाजित करेगा।\nअतः a और b का कम से कम एक उभयनिष्ठ गुणनखंड 5 है।\nपरंतु यह इस तथ्य का विरोधाभास है कि a और b सह-अभाज्य हैं।\nयह विरोधाभास हमारी गलत कल्पना के कारण उत्पन्न हुआ कि √5 परिमेय है।\nअतः √5 एक अपरिमेय संख्या है। सिद्ध हुआ।",
            answerEnglish = "Proof by contradiction:\nAssume √5 is rational. Then √5 = a/b where a and b are co-prime integers (b ≠ 0, HCF(a,b) = 1).\nSquaring both sides: 5 = a²/b² => a² = 5b² ...(1)\nThus 5 divides a², which implies 5 divides a.\nLet a = 5c. Substituting in (1): (5c)² = 5b² => 25c² = 5b² => b² = 5c² ...(2)\nThus 5 divides b², so 5 divides b.\nHence, 5 is a common factor of both a and b, contradicting that a and b are co-prime.\nTherefore, √5 is an irrational number. Hence proved.",
            solutionSteps = listOf(
                "√5 को a/b के रूप में परिमेय मानें (सह-अभाज्य)।",
                "वर्ग करके a² = 5b² दिखाएँ (5 divides a)।",
                "a = 5c रखकर b² = 5c² दिखाएँ (5 divides b)।",
                "उभयनिष्ठ गुणनखंड 5 दिखाकर विरोधाभास लिखें।"
            ),
            keyFormulasOrPoints = listOf("Proof by contradiction", "HCF(a, b) = 1", "√2, √3, √5 similar proofs"),
            examTip = "JAC 10वीं बोर्ड में √2, √3 या √5 में से एक प्रश्न शत-प्रतिशत 3 अंक में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch2_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch2",
            chapterName = "बहुपद",
            year = 2024,
            questionNo = 7,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "द्विघात बहुपद x² - 2x - 8 के शून्यक ज्ञात कीजिए और शून्यकों तथा गुणांकों के बीच के संबंध की सत्यता की जाँच कीजिए।",
            questionEnglish = "Find the zeroes of the quadratic polynomial x² - 2x - 8, and verify the relationship between the zeroes and the coefficients.",
            answerHindi = "दिए गए बहुपद के शून्यक ज्ञात करने के लिए:\nx² - 2x - 8 = 0\nमध्य पद को विभक्त करने पर (-4 और +2):\nx² - 4x + 2x - 8 = 0\nx(x - 4) + 2(x - 4) = 0\n(x - 4)(x + 2) = 0\n=> x = 4 या x = -2\nअतः शून्यक: α = 4 और β = -2 हैं।\n\nसत्यता की जाँच:\nतुलना ax² + bx + c = 0 से करने पर: a = 1, b = -2, c = -8\n\n1. शून्यकों का योगफल (α + β):\nα + β = 4 + (-2) = 2\nसूत्र से: -b / a = -(-2) / 1 = 2\nअतः α + β = -b / a (सत्यापित)\n\n2. शून्यकों का गुणनफल (α · β):\nα · β = 4 × (-2) = -8\nसूत्र से: c / a = -8 / 1 = -8\nअतः α · β = c / a (सत्यापित)।",
            answerEnglish = "Factorising x² - 2x - 8 = (x - 4)(x + 2) = 0 => x = 4, -2.\nZeroes: α = 4, β = -2. Coefficients: a = 1, b = -2, c = -8.\nSum of zeroes: α + β = 4 + (-2) = 2 = -b/a = -(-2)/1 = 2 (Verified).\nProduct of zeroes: αβ = 4(-2) = -8 = c/a = -8/1 = -8 (Verified).",
            solutionSteps = listOf(
                "मध्य पद विभक्त करके गुणनखंड करें: (x - 4)(x + 2) = 0",
                "शून्यक प्राप्त करें: α = 4, β = -2",
                "गुणांक लिखें: a = 1, b = -2, c = -8",
                "योगफल α + β = -b/a तथा गुणनफल αβ = c/a सत्यापित करें।"
            ),
            keyFormulasOrPoints = listOf("α + β = -b/a", "α · β = c/a", "x² - (α+β)x + αβ = 0"),
            examTip = "चिह्न (+ और -) का विशेष ध्यान रखें, विशेषकर -b/a में माइनस के दोहराव पर।"
        ),
        PyqQuestion(
            id = "q_10_math_2023_ch3_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch3",
            chapterName = "दो चर वाले रैखिक समीकरण युग्म",
            year = 2023,
            questionNo = 12,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "निम्न रैखिक समीकरण युग्म को ग्राफीय विधि से हल कीजिए:\nx + 3y = 6\n2x - 3y = 12",
            questionEnglish = "Solve the following pair of linear equations graphically:\nx + 3y = 6\n2x - 3y = 12",
            answerHindi = "समीकरण (1): x + 3y = 6 => x = 6 - 3y\n• यदि y = 0, तो x = 6 - 3(0) = 6  →  बिंदु A(6, 0)\n• यदि y = 2, तो x = 6 - 3(2) = 0  →  बिंदु B(0, 2)\n\nसमीकरण (2): 2x - 3y = 12 => 2x = 12 + 3y => x = (12 + 3y) / 2\n• यदि y = 0, तो x = (12 + 0) / 2 = 6  →  बिंदु A(6, 0)\n• यदि y = -2, तो x = (12 - 6) / 2 = 3  →  बिंदु C(3, -2)\n• यदि y = -4, तो x = (12 - 12) / 2 = 0 → बिंदु D(0, -4)\n\nग्राफ से निष्कर्ष:\nदोनों सरल रेखाएँ बिंदु (6, 0) पर एक-दूसरे को प्रतिच्छेद करती हैं।\nअतः अभीष्ट हल: x = 6 और y = 0 है।\nजाँच:\nसमीकरण (1): 6 + 3(0) = 6 (सत्य)\nसमीकरण (2): 2(6) - 3(0) = 12 - 0 = 12 (सत्य)।",
            answerEnglish = "Table for x + 3y = 6: (6, 0), (0, 2).\nTable for 2x - 3y = 12: (6, 0), (0, -4).\nBoth lines intersect at point (6, 0). Hence solution is x = 6, y = 0.",
            solutionSteps = listOf(
                "प्रत्येक समीकरण के लिए कम से कम 2-3 निर्देशांक (x, y) निकालें।",
                "ग्राफ पेपर पर दोनों रेखाएं खींचें।",
                "प्रतिच्छेद बिंदु पहचानें: (6, 0)।",
                "x = 6, y = 0 लिखकर उत्तर सत्यापित करें।"
            ),
            keyFormulasOrPoints = listOf("प्रतिच्छेदी रेखाएँ → अद्वितीय हल (Unique Solution)", "प्रतिच्छेद बिंदु ही हल है"),
            examTip = "JAC बोर्ड के खंड-D (Section-D) में 5 अंक का एक प्रश्न अनिवार्य रूप से ग्राफ विधि का आता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch4",
            chapterName = "द्विघात समीकरण",
            year = 2023,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "द्विघात समीकरण 2x² - 7x + 3 = 0 के मूल (Roots) द्विघाती सूत्र का उपयोग करके ज्ञात कीजिए। मूलों की प्रकृति भी बताइए।",
            questionEnglish = "Find the roots of the quadratic equation 2x² - 7x + 3 = 0 using quadratic formula. Also state the nature of roots.",
            answerHindi = "दिए गए समीकरण की तुलना मानक रूप ax² + bx + c = 0 से करने पर:\na = 2, b = -7, c = 3\n\nचरण 1: विविक्तकर (Discriminant D) का मान:\nD = b² - 4ac\nD = (-7)² - 4(2)(3)\nD = 49 - 24 = 25\nचूँकि D = 25 > 0, अतः मूल वास्तविक और असमान (भिन्न) होंगे।\n\nचरण 2: द्विघाती सूत्र (श्रीधराचार्य सूत्र):\nx = [-b ± √D] / (2a)\nx = [-(-7) ± √25] / (2 × 2)\nx = [7 ± 5] / 4\n\nधनात्मक चिह्न लेने पर:\nx = (7 + 5) / 4 = 12 / 4 = 3\n\nऋणात्मक चिह्न लेने पर:\nx = (7 - 5) / 4 = 2 / 4 = 1/2\n\nअतः अभीष्ट मूल: x = 3 और x = 1/2 हैं।",
            answerEnglish = "Comparing with ax² + bx + c = 0:\na = 2, b = -7, c = 3.\nDiscriminant D = b² - 4ac = (-7)² - 4(2)(3) = 49 - 24 = 25.\nSince D > 0, roots are real and distinct.\nQuadratic formula: x = [-b ± √D] / (2a)\nx = [7 ± √25] / (2×2) = [7 ± 5] / 4.\nFor + sign: x = 12/4 = 3.\nFor - sign: x = 2/4 = 1/2.\nRoots are 3 and 1/2.",
            solutionSteps = listOf(
                "a, b, c पहचानें (a=2, b=-7, c=3)।",
                "विविक्तकर D = b² - 4ac की गणना करें (D = 25)।",
                "मूलों की प्रकृति: D > 0 → दो भिन्न वास्तविक मूल।",
                "सूत्र x = [-b ± √D] / 2a में मान रखकर दोनों मूल प्राप्त करें।"
            ),
            keyFormulasOrPoints = listOf("D = b² - 4ac", "x = [-b ± √D] / 2a", "D > 0: Real & Distinct"),
            examTip = "विविक्तकर (D) का मान पहले निकालें, इससे प्रकृति का 1 अंक सुनिश्चित हो जाता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch5_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch5",
            chapterName = "समांतर श्रेढ़ियाँ",
            year = 2024,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "समांतर श्रेढ़ी (A.P.): 3, 8, 13, 18, ... का कौन सा पद 78 है? तथा इसके प्रथम 20 पदों का योगफल भी ज्ञात कीजिए।",
            questionEnglish = "Which term of the AP: 3, 8, 13, 18, ... is 78? Also find the sum of its first 20 terms.",
            answerHindi = "दी गई A.P.: 3, 8, 13, 18, ...\nप्रथम पद (a) = 3\nसार्व अंतर (d) = 8 - 3 = 5\nमाना n-वाँ पद an = 78 है।\n\nभाग 1: n का मान ज्ञात करना:\nan = a + (n - 1)d\n78 = 3 + (n - 1)5\n78 - 3 = (n - 1)5\n75 = (n - 1)5\nn - 1 = 75 / 5 = 15\nn = 15 + 1 = 16\nअतः दी गई A.P. का 16वाँ पद 78 है।\n\nभाग 2: प्रथम 20 पदों का योगफल (S20):\nSn = (n / 2) [2a + (n - 1)d]\nS20 = (20 / 2) [2(3) + (20 - 1)5]\nS20 = 10 [6 + 19 × 5]\nS20 = 10 [6 + 95] = 10 × 101 = 1010\n\nअतः A.P. का 16वाँ पद 78 है तथा प्रथम 20 पदों का योगफल 1010 है।",
            answerEnglish = "Here a = 3, d = 5, an = 78.\nan = a + (n-1)d => 78 = 3 + (n-1)5 => n-1 = 15 => n = 16.\nSum of 20 terms: S20 = (20/2)[2(3) + (20-1)5] = 10[6 + 95] = 10(101) = 1010.",
            solutionSteps = listOf(
                "a = 3, d = 5 पहचानें।",
                "an = a + (n-1)d = 78 हल करके n = 16 प्राप्त करें।",
                "Sn = (n/2)[2a + (n-1)d] में n=20 रखकर हल करें: S20 = 1010।"
            ),
            keyFormulasOrPoints = listOf("an = a + (n - 1)d", "Sn = n/2 [2a + (n - 1)d]", "Sn = n/2 [a + l]"),
            examTip = "A.P. का n-वाँ पद और योगफल सूत्र हर वर्ष 3 से 5 अंकों में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch6_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch6",
            chapterName = "त्रिभुज",
            year = 2024,
            questionNo = 15,
            marks = 6,
            type = QuestionType.LONG,
            questionHindi = "सिद्ध कीजिए कि यदि किसी त्रिभुज की एक भुजा के समांतर अन्य दो भुजाओं को भिन्न-भिन्न बिंदुओं पर प्रतिच्छेद करने के लिए एक रेखा खींची जाए, तो ये अन्य दो भुजाएँ एक ही अनुपात में विभाजित हो जाती हैं। (थेल्स प्रमेय / BPT)",
            questionEnglish = "Prove that if a line is drawn parallel to one side of a triangle intersecting the other two sides in distinct points, then the other two sides are divided in the same ratio. (Thales Theorem / BPT)",
            answerHindi = "दिया है: त्रिभुज ABC में भुजा BC के समांतर एक रेखा DE खींची गई है, जो AB को D पर तथा AC को E पर प्रतिच्छेद करती है (अर्थात DE || BC)।\n\nसिद्ध करना है: AD / DB = AE / EC\n\nरचना: B को E से तथा C को D से मिलाया। रेखाखंड EN ⊥ AB तथा DM ⊥ AC खींचा।\n\nउपपत्ति:\nत्रिभुज का क्षेत्रफल = ½ × आधार × ऊँचाई\nar(ΔADE) = ½ × AD × EN\nar(ΔBDE) = ½ × DB × EN\nअतः ar(ΔADE) / ar(ΔBDE) = (½ × AD × EN) / (½ × DB × EN) = AD / DB ... (समीकरण 1)\n\nइसी प्रकार:\nar(ΔADE) = ½ × AE × DM\nar(ΔDEC) = ½ × EC × DM\nअतः ar(ΔADE) / ar(ΔDEC) = (½ × AE × DM) / (½ × EC × DM) = AE / EC ... (समीकरण 2)\n\nचूँकि ΔBDE और ΔDEC एक ही आधार DE तथा एक ही समांतर रेखाओं DE और BC के बीच बने दो त्रिभुज हैं:\nअतः ar(ΔBDE) = ar(ΔDEC) ... (समीकरण 3)\n\nसमीकरण (1), (2) तथा (3) से:\nAD / DB = AE / EC\nइति सिद्धम् (Hence Proved)।",
            answerEnglish = "Given: In ΔABC, DE || BC.\nTo prove: AD/DB = AE/EC.\nConstruction: Join BE, CD. Draw EN ⊥ AB and DM ⊥ AC.\nProof: ar(ADE)/ar(BDE) = AD/DB and ar(ADE)/ar(DEC) = AE/EC.\nSince ΔBDE and ΔDEC lie on the same base DE between same parallels DE and BC, ar(BDE) = ar(DEC).\nHence, AD/DB = AE/EC.",
            solutionSteps = listOf(
                "दिया है और सिद्ध करना है स्पष्ट लिखें।",
                "रचना: BE, CD को मिलाएं और लंब EN ⊥ AB, DM ⊥ AC खींचें।",
                "क्षेत्रफलों का अनुपात निकालें।",
                "एक ही आधार और समांतर रेखाओं के बीच त्रिभुजों के क्षेत्रफल बराबर दिखाएं।"
            ),
            keyFormulasOrPoints = listOf("ar(Δ) = ½ × base × height", "आधारभूत आनुपातिकता प्रमेय (BPT)", "AD/DB = AE/EC"),
            examTip = "थेल्स प्रमेय या इसका विलोम JAC 10वीं बोर्ड का सबसे अधिक बार पूछा जाने वाला 6-अंक का प्रश्न है!"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch7_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch7",
            chapterName = "निर्देशांक ज्यामिति",
            year = 2024,
            questionNo = 10,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "उस बिंदु के निर्देशांक ज्ञात कीजिए जो बिंदुओं (-1, 7) और (4, -3) को मिलाने वाले रेखाखंड को 2:3 के अनुपात में आंतरिक रूप से विभाजित करता है।",
            questionEnglish = "Find the coordinates of the point which divides the line segment joining the points (-1, 7) and (4, -3) in the ratio 2:3 internally.",
            answerHindi = "माना अभीष्ट बिंदु P(x, y) है।\nयहाँ:\n(x1, y1) = (-1, 7)\n(x2, y2) = (4, -3)\nअनुपात: m1 : m2 = 2 : 3\n\nविभाजन सूत्र (Section Formula) से:\nx = (m1·x2 + m2·x1) / (m1 + m2)\nx = [2(4) + 3(-1)] / (2 + 3)\nx = (8 - 3) / 5 = 5 / 5 = 1\n\ny = (m1·y2 + m2·y1) / (m1 + m2)\ny = [2(-3) + 3(7)] / (2 + 3)\ny = (-6 + 21) / 5 = 15 / 5 = 3\n\nअतः अभीष्ट बिंदु के निर्देशांक P(1, 3) हैं।",
            answerEnglish = "By section formula: x = (m1·x2 + m2·x1)/(m1 + m2) = [2(4) + 3(-1)]/(2+3) = 5/5 = 1.\ny = (m1·y2 + m2·y1)/(m1 + m2) = [2(-3) + 3(7)]/(2+3) = 15/5 = 3.\nRequired coordinates are (1, 3).",
            solutionSteps = listOf(
                "x1, y1, x2, y2 तथा m1, m2 स्पष्ट लिखें।",
                "x = (m1 x2 + m2 x1)/(m1 + m2) की गणना करें (x = 1)।",
                "y = (m1 y2 + m2 y1)/(m1 + m2) की गणना करें (y = 3)।",
                "अंतिम उत्तर P(1, 3) लिखें।"
            ),
            keyFormulasOrPoints = listOf("x = (m1 x2 + m2 x1) / (m1 + m2)", "y = (m1 y2 + m2 y1) / (m1 + m2)", "मध्यबिंदु सूत्र: ((x1+x2)/2, (y1+y2)/2)"),
            examTip = "दूरी सूत्र: d = √[(x2 - x1)² + (y2 - y1)²] पर भी 1 अंक का प्रश्न पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch8_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch8",
            chapterName = "त्रिकोणमिति का परिचय",
            year = 2024,
            questionNo = 13,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "सिद्ध कीजिए कि:\n(cosec θ - cot θ)² = (1 - cos θ) / (1 + cos θ)",
            questionEnglish = "Prove that:\n(cosec θ - cot θ)² = (1 - cos θ) / (1 + cos θ)",
            answerHindi = "बायाँ पक्ष (L.H.S.):\n= (cosec θ - cot θ)²\nहम जानते हैं कि: cosec θ = 1 / sin θ तथा cot θ = cos θ / sin θ\n= [(1 / sin θ) - (cos θ / sin θ)]²\n= [(1 - cos θ) / sin θ]²\n= (1 - cos θ)² / sin² θ\n\nसर्वसमिका sin² θ = 1 - cos² θ का प्रयोग करने पर:\n= (1 - cos θ)² / (1 - cos² θ)\n\nहर में a² - b² = (a - b)(a + b) लगाने पर:\n= (1 - cos θ)(1 - cos θ) / [(1 - cos θ)(1 + cos θ)]\n\n(1 - cos θ) को अंश और हर से काटने पर:\n= (1 - cos θ) / (1 + cos θ)\n= दायाँ पक्ष (R.H.S.)\nइति सिद्धम् (Hence Proved)।",
            answerEnglish = "LHS = (cosec θ - cot θ)² = [(1 - cos θ)/sin θ]² = (1 - cos θ)² / sin² θ = (1 - cos θ)² / (1 - cos² θ) = (1 - cos θ)(1 - cos θ) / [(1 - cos θ)(1 + cos θ)] = (1 - cos θ) / (1 + cos θ) = RHS. Hence proved.",
            solutionSteps = listOf(
                "cosec θ को 1/sin θ और cot θ को cos θ/sin θ में बदलें।",
                "वर्ग को अलग करें: (1 - cos θ)² / sin² θ",
                "sin² θ = 1 - cos² θ = (1 - cos θ)(1 + cos θ) का प्रयोग करें।",
                "उभयनिष्ठ पद काटकर RHS प्राप्त करें।"
            ),
            keyFormulasOrPoints = listOf("sin² θ + cos² θ = 1", "cosec θ = 1/sin θ, cot θ = cos θ/sin θ", "a² - b² = (a - b)(a + b)"),
            examTip = "त्रिकोणमितीय सर्वसमिका सिद्ध करते समय सभी पदों को sin और cos में बदलना सबसे सरल रणनीति होती है।"
        ),
        PyqQuestion(
            id = "q_10_math_2023_ch9_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch9",
            chapterName = "त्रिकोणमिति के कुछ अनुप्रयोग",
            year = 2023,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "भूमि के एक बिंदु से, जो एक मीनार के पाद-बिंदु से 30 m की दूरी पर है, मीनार के शिखर का उन्नयन कोण 30° है। मीनार की ऊँचाई ज्ञात कीजिए।",
            questionEnglish = "The angle of elevation of the top of a tower from a point on the ground, which is 30 m away from the foot of the tower, is 30°. Find the height of the tower.",
            answerHindi = "माना AB एक मीनार है जिसकी ऊँचाई h मीटर है।\nभूमि पर बिंदु C, मीनार के पाद B से 30 m की दूरी पर है, अर्थात BC = 30 m।\nबिंदु C पर उन्नयन कोण ∠ACB = 30° है।\n\nसमकोण त्रिभुज ABC में (∠B = 90°):\ntan θ = लंब (AB) / आधार (BC)\ntan 30° = h / 30\n\nहम जानते हैं कि tan 30° = 1 / √3:\n1 / √3 = h / 30\n=> h = 30 / √3\n\nहर का परिमेयकरण करने पर:\nh = (30 × √3) / (√3 × √3)\nh = 30√3 / 3 = 10√3 मीटर\n(यदि √3 = 1.732 रखें, तो h = 10 × 1.732 = 17.32 m)\n\nअतः मीनार की अभीष्ट ऊँचाई 10√3 मीटर (या 17.32 m) है।",
            answerEnglish = "Let AB = h be height of tower, BC = 30 m be distance. In right ΔABC, tan 30° = AB/BC => 1/√3 = h/30 => h = 30/√3 = 10√3 m (or 17.32 m).",
            solutionSteps = listOf(
                "साफ नामांकित समकोण त्रिभुज बनाएं।",
                "tan 30° = AB / BC संबंध स्थापित करें।",
                "tan 30° = 1/√3 मान रखकर h ज्ञात करें।",
                "हर का परिमेयकरण करके h = 10√3 m लिखें।"
            ),
            keyFormulasOrPoints = listOf("tan θ = Perpendicular / Base", "tan 30° = 1/√3, tan 45° = 1, tan 60° = √3"),
            examTip = "ऊँचाई और दूरी के प्रश्नों में चित्र (Diagram) बनाना अनिवार्य है; चित्र पर 1-2 अंक निर्धारित होते हैं।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch10_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch10",
            chapterName = "वृत्त",
            year = 2024,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "सिद्ध कीजिए कि बाह्य बिंदु से वृत्त पर खींची गई स्पर्श रेखाओं की लंबाइयाँ बराबर होती हैं। (प्रमेय 10.2)",
            questionEnglish = "Prove that the lengths of tangents drawn from an external point to a circle are equal. (Theorem 10.2)",
            answerHindi = "दिया है: केंद्र O वाला एक वृत्त है तथा P एक बाह्य बिंदु है, जिससे वृत्त पर दो स्पर्श रेखाएं PQ और PR खींची गई हैं (जहाँ Q और R स्पर्श बिंदु हैं)।\n\nसिद्ध करना है: PQ = PR\n\nरचना: OQ, OR तथा OP को मिलाया।\n\nउपपत्ति:\nहम जानते हैं कि वृत्त के किसी बिंदु पर स्पर्श रेखा, स्पर्श बिंदु से जाने वाली त्रिज्या पर लंब होती है (प्रमेय 10.1)।\nअतः ∠OQP = 90° तथा ∠ORP = 90°\n\nअब, दो समकोण त्रिभुजों ΔOQP और ΔORP में:\n1. OQ = OR (एक ही वृत्त की त्रिज्याएँ)\n2. OP = OP (उभयनिष्ठ / Common कर्ण)\n3. ∠OQP = ∠ORP = 90°\n\nअतः RHS सर्वांगसमता कसौटी से:\nΔOQP ≅ ΔORP\n\nअतः सर्वांगसम त्रिभुजों के संगत भाग बराबर होते हैं (CPCT):\nPQ = PR\nइति सिद्धम् (Hence Proved)।",
            answerEnglish = "Given: A circle with centre O and two tangents PQ and PR from external point P.\nTo prove: PQ = PR.\nProof: In right triangles ΔOQP and ΔORP:\nOQ = OR (radii), OP = OP (common hypotenuse), ∠OQP = ∠ORP = 90°.\nBy RHS congruence: ΔOQP ≅ ΔORP.\nTherefore, PQ = PR (CPCT). Hence proved.",
            solutionSteps = listOf(
                "दिया है और सिद्ध करना है स्पष्ट लिखें।",
                "रचना: OQ, OR और OP को मिलाएं।",
                "प्रमेय 10.1 से कोण 90° बताएं।",
                "RHS सर्वांगसमता द्वारा PQ = PR सिद्ध करें।"
            ),
            keyFormulasOrPoints = listOf("Theorem 10.1: Radius ⊥ Tangent at point of contact", "Theorem 10.2: Tangents from external point are equal"),
            examTip = "यह प्रमेय JAC 10वीं बोर्ड परीक्षा में लगभग हर वैकल्पिक वर्ष में 5 अंक में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_math_2023_ch11_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch11",
            chapterName = "रचनाएँ",
            year = 2023,
            questionNo = 16,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "6 cm त्रिज्या का एक वृत्त खींचिए। केंद्र से 10 cm दूर स्थित एक बिंदु से वृत्त पर स्पर्श रेखा युग्म की रचना कीजिए और उनकी लंबाइयाँ मापिए।",
            questionEnglish = "Draw a circle of radius 6 cm. From a point 10 cm away from its centre, construct the pair of tangents to the circle and measure their lengths.",
            answerHindi = "रचना के पद:\n1. बिंदु O को केंद्र मानकर परकार की सहायता से 6 cm त्रिज्या का एक वृत्त खींचते हैं।\n2. केंद्र O से 10 cm की दूरी पर एक बिंदु P लेते हैं (OP = 10 cm)।\n3. रेखाखंड OP का लंब समद्विभाजक (Perpendicular Bisector) खींचते हैं, जो OP को बिंदु M पर काटता है (जहाँ M, OP का मध्यबिंदु है)।\n4. M को केंद्र तथा MO (या MP) को त्रिज्या मानकर एक अन्य वृत्त खींचते हैं, जो पहले वृत्त को दो बिंदुओं Q और R पर प्रतिच्छेद करता है।\n5. P को Q से तथा P को R से मिलाते हैं।\nPQ और PR अभीष्ट स्पर्श रेखा युग्म हैं।\n\nमाप एवं गणना:\nसमकोण त्रिभुज OQP में (∠OQP = 90°):\nPQ = √(OP² - OQ²) = √(10² - 6²) = √(100 - 36) = √64 = 8 cm\nअतः प्रत्येक स्पर्श रेखा की लंबाई 8 cm है।",
            answerEnglish = "Steps of Construction: 1. Draw circle of radius 6 cm with centre O. 2. Mark point P such that OP = 10 cm. 3. Bisect OP at M. 4. Draw circle with centre M and radius MO intersecting given circle at Q and R. 5. Join PQ and PR. Length PQ = PR = √(10² - 6²) = 8 cm.",
            solutionSteps = listOf(
                "6 cm त्रिज्या का वृत्त और OP = 10 cm खींचें।",
                "OP का लंब समद्विभाजक खींचकर मध्यबिंदु M प्राप्त करें।",
                "M केंद्र से वृत्त खींचकर प्रतिच्छेद बिंदु Q, R प्राप्त करें।",
                "PQ, PR जोड़ें और लंबाई 8 cm मापें।"
            ),
            keyFormulasOrPoints = listOf("Tangent Length = √(d² - r²)", "√(10² - 6²) = 8 cm"),
            examTip = "रचना के पद पेंसिल से स्पष्ट और क्रमबद्ध लिखें। परकार के चाप मिटाएं नहीं।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch12_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch12",
            chapterName = "वृत्तों से संबंधित क्षेत्रफल",
            year = 2024,
            questionNo = 11,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "6 cm त्रिज्या वाले एक वृत्त के एक त्रिज्यखंड का क्षेत्रफल ज्ञात कीजिए, जिसका केंद्रीय कोण 60° है। (π = 22/7 प्रयोग कीजिए)",
            questionEnglish = "Find the area of a sector of a circle with radius 6 cm if angle of the sector is 60°. (Use π = 22/7)",
            answerHindi = "दिया है:\nवृत्त की त्रिज्या (r) = 6 cm\nत्रिज्यखंड का कोण (θ) = 60°\n\nत्रिज्यखंड का क्षेत्रफल सूत्र:\nक्षेत्रफल = (θ / 360°) × πr²\n= (60° / 360°) × (22 / 7) × (6)²\n= (1 / 6) × (22 / 7) × 36\n= (22 / 7) × 6\n= 132 / 7 cm²\n= 18.86 cm²\n\nअतः त्रिज्यखंड का अभीष्ट क्षेत्रफल 132/7 cm² (या 18.86 cm²) है।",
            answerEnglish = "Given r = 6 cm, θ = 60°.\nArea of sector = (θ/360°) × πr² = (60/360) × (22/7) × 36 = (1/6) × 36 × (22/7) = 132/7 cm² = 18.86 cm².",
            solutionSteps = listOf(
                "त्रिज्या r = 6 cm, कोण θ = 60° लिखें।",
                "सूत्र लिखें: Area = (θ/360) × πr²",
                "मान प्रतिस्थापित करके हल करें: (1/6) × (22/7) × 36 = 132/7 cm²"
            ),
            keyFormulasOrPoints = listOf("Area of Sector = (θ / 360°) × πr²", "Length of Arc = (θ / 360°) × 2πr"),
            examTip = "उत्तर को भिन्न (132/7 cm²) और दशमलव दोनों में लिख सकते हैं। मात्रक cm² लिखना न भूलें।"
        ),
        PyqQuestion(
            id = "q_10_math_2023_ch13_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch13",
            chapterName = "पृष्ठीय क्षेत्रफल और आयतन",
            year = 2023,
            questionNo = 17,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "2 घनों, जिनमें से प्रत्येक का आयतन 64 cm³ है, के संलग्न फलकों को मिलाकर एक ठोस बनाया जाता है। इससे प्राप्त घनाभ का कुल पृष्ठीय क्षेत्रफल ज्ञात कीजिए।",
            questionEnglish = "2 cubes each of volume 64 cm³ are joined end to end. Find the total surface area of the resulting cuboid.",
            answerHindi = "माना प्रत्येक घन की भुजा a है।\nघन का आयतन = a³ = 64 cm³\n=> a = ∛64 = 4 cm\n\nजब दोनों घनों को सिरे से सिरा मिलाकर जोड़ा जाता है, तो प्राप्त घनाभ की विमाएँ:\n• लंबाई (l) = a + a = 4 + 4 = 8 cm\n• चौड़ाई (b) = a = 4 cm\n• ऊँचाई (h) = a = 4 cm\n\nघनाभ का कुल पृष्ठीय क्षेत्रफल सूत्र:\n= 2(lb + bh + hl)\n= 2[(8 × 4) + (4 × 4) + (4 × 8)]\n= 2[32 + 16 + 32]\n= 2[80] = 160 cm²\n\nअतः प्राप्त घनाभ का कुल पृष्ठीय क्षेत्रफल 160 cm² है।",
            answerEnglish = "Volume of each cube = a³ = 64 cm³ => side a = 4 cm.\nWhen joined, resulting cuboid has: l = 8 cm, b = 4 cm, h = 4 cm.\nTotal Surface Area = 2(lb + bh + hl) = 2(32 + 16 + 32) = 2(80) = 160 cm².",
            solutionSteps = listOf(
                "घन का आयतन a³ = 64 से भुजा a = 4 cm निकालें।",
                "घनाभ की विमाएँ लिखें: l = 8 cm, b = 4 cm, h = 4 cm।",
                "सूत्र 2(lb + bh + hl) में मान रखें।",
                "हल करके 160 cm² प्राप्त करें।"
            ),
            keyFormulasOrPoints = listOf("Cube Volume = a³", "Cuboid TSA = 2(lb + bh + hl)", "TSA = 160 cm²"),
            examTip = "खिलौने का पृष्ठीय क्षेत्रफल (शंकु + अर्धगोला) भी बोर्ड परीक्षा का बहुचर्चित प्रश्न है।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch14_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch14",
            chapterName = "सांख्यिकी",
            year = 2024,
            questionNo = 19,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "निम्नलिखित आँकड़ों का बहुलक (Mode) ज्ञात कीजिए:\nवर्ग अंतराल: 1-3 (7), 3-5 (8), 5-7 (2), 7-9 (2), 9-11 (1)",
            questionEnglish = "Find the mode of the following data:\nClass interval: 1-3 (7), 3-5 (8), 5-7 (2), 7-9 (2), 9-11 (1)",
            answerHindi = "दिए गए आँकड़ों में अधिकतम बारंबारता 8 है, जो वर्ग अंतराल 3-5 की है।\nअतः बहुलक वर्ग (Modal Class) = 3 - 5\n\nयहाँ:\n• बहुलक वर्ग की निम्न सीमा (l) = 3\n• वर्ग अंतराल का माप (h) = 5 - 3 = 2\n• बहुलक वर्ग की बारंबारता (f1) = 8\n• बहुलक वर्ग से ठीक पहले वर्ग की बारंबारता (f0) = 7\n• बहुलक वर्ग के ठीक बाद वर्ग की बारंबारता (f2) = 2\n\nबहुलक सूत्र:\nबहुलक = l + [(f1 - f0) / (2f1 - f0 - f2)] × h\n= 3 + [(8 - 7) / (2(8) - 7 - 2)] × 2\n= 3 + [1 / (16 - 9)] × 2\n= 3 + (2 / 7)\n= 3 + 0.286 = 3.286 (या 3.29)\n\nअतः दिए गए आँकड़ों का बहुलक 3.286 है।",
            answerEnglish = "Maximum frequency is 8, corresponding to modal class 3-5.\nl = 3, h = 2, f1 = 8, f0 = 7, f2 = 2.\nMode = l + [(f1 - f0)/(2f1 - f0 - f2)] × h = 3 + [(8-7)/(16-7-2)] × 2 = 3 + 2/7 = 3.286.",
            solutionSteps = listOf(
                "अधिकतम बारंबारता पहचानें → बहुलक वर्ग 3-5",
                "l = 3, f1 = 8, f0 = 7, f2 = 2, h = 2 लिखें।",
                "सूत्र में मान रखें: 3 + [1/7] × 2 = 3 + 0.286",
                "उत्तर 3.286 लिखें।"
            ),
            keyFormulasOrPoints = listOf("Mode = l + [(f1 - f0) / (2f1 - f0 - f2)] × h", "Empirical formula: 3 Median = Mode + 2 Mean"),
            examTip = "सांख्यिकी से माध्य, माध्यक और बहुलक में से दो प्रश्न 5-5 अंकों में हमेशा पूछे जाते हैं।"
        ),
        PyqQuestion(
            id = "q_10_math_2024_ch15_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_math",
            chapterId = "c10_math_ch15",
            chapterName = "प्रायिकता",
            year = 2024,
            questionNo = 8,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "एक थैले में 3 लाल और 5 काली गेंदें हैं। इस थैले में से एक गेंद यादृच्छया निकाली जाती है। इसकी प्रायिकता क्या है कि गेंद:\n(i) लाल हो?\n(ii) लाल नहीं हो?",
            questionEnglish = "A bag contains 3 red balls and 5 black balls. A ball is drawn at random from the bag. What is the probability that the ball drawn is:\n(i) red?\n(ii) not red?",
            answerHindi = "थैले में गेंदों की कुल संख्या:\nलाल गेंदें = 3\nकाली गेंदें = 5\nकुल संभव परिणाम n(S) = 3 + 5 = 8\n\n(i) लाल गेंद होने की प्रायिकता P(लाल):\nलाल गेंद के अनुकूल परिणामों की संख्या n(E) = 3\nP(लाल) = n(E) / n(S) = 3 / 8\n\n(ii) लाल गेंद नहीं होने की प्रायिकता P(लाल नहीं):\nहम जानते हैं कि किसी घटना के घटित होने और न होने की प्रायिकताओं का योग 1 होता है:\nP(E') = 1 - P(E)\n=> P(लाल नहीं) = 1 - P(लाल)\n= 1 - 3/8\n= (8 - 3) / 8 = 5 / 8\n(वैकल्पिक: लाल नहीं अर्थात काली गेंद, अतः 5/8)।\n\nउत्तर: (i) 3/8, (ii) 5/8",
            answerEnglish = "Total balls n(S) = 3 + 5 = 8.\n(i) P(Red) = 3/8.\n(ii) P(Not Red) = 1 - P(Red) = 1 - 3/8 = 5/8.",
            solutionSteps = listOf(
                "कुल परिणाम n(S) = 3 + 5 = 8 निकालें।",
                "(i) P(लाल) = 3/8",
                "(ii) P(लाल नहीं) = 1 - 3/8 = 5/8"
            ),
            keyFormulasOrPoints = listOf("P(E) = अनुकूल परिणाम / कुल परिणाम", "P(E) + P(E') = 1", "0 ≤ P(E) ≤ 1"),
            examTip = "प्रायिकता का मान कभी भी 1 से बड़ा या ऋणात्मक (negative) नहीं हो सकता।"
        ),

        // ==================== CLASS 10 SOCIAL SCIENCE - BOOK 1: HISTORY (इतिहास) ====================
        PyqQuestion(
            id = "q_10_sst_hist_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_hist",
            chapterId = "c10_sst_hist_ch1",
            chapterName = "यूरोप में राष्ट्रवाद का उदय",
            year = 2024,
            questionNo = 1,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "'यंग इटली' (Young Italy) नामक गुप्त क्रांतिकारी संगठन की स्थापना किसने की थी?",
            questionEnglish = "Who founded the secret revolutionary society named 'Young Italy'?",
            options = listOf("ग्यूसेपे मेत्सिनी (Giuseppe Mazzini)", "ग्यूसेपे गैरीबाल्डी (Giuseppe Garibaldi)", "काउंट कावूर (Count Cavour)", "ओटो वॉन बिस्मार्क (Otto von Bismarck)"),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) ग्यूसेपे मेत्सिनी (Giuseppe Mazzini)\nग्यूसेपे मेत्सिनी ने 1831 में मार्सेई में 'यंग इटली' और बर्न में 'यंग यूरोप' नामक दो गुप्त संगठनों की स्थापना की थी। उनका मानना था कि ईश्वर की मर्जी के अनुसार राष्ट्र ही मनुष्यों की प्राकृतिक इकाई हैं।",
            answerEnglish = "Correct Answer: (A) Giuseppe Mazzini\nMazzini founded two underground societies: 'Young Italy' in Marseilles (1831) and 'Young Europe' in Berne. He believed God intended nations to be natural units of mankind.",
            solutionSteps = listOf(
                "यंग इटली के संस्थापक: ग्यूसेपे मेत्सिनी (1831)।",
                "स्थापना स्थल: मार्सेई (Marseilles)।",
                "उद्देश्य: इटली का एकीकरण और गणतंत्र की स्थापना।"
            ),
            keyFormulasOrPoints = listOf("Young Italy (1831) - Giuseppe Mazzini", "Young Europe in Berne"),
            examTip = "मेत्सिनी को मैटरनिख ने 'हमारी सामाजिक व्यवस्था का सबसे खतरनाक दुश्मन' कहा था।"
        ),
        PyqQuestion(
            id = "q_10_sst_hist_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_hist",
            chapterId = "c10_sst_hist_ch2",
            chapterName = "भारत में राष्ट्रवाद",
            year = 2024,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "जलियांवाला बाग हत्याकांड की घटना का सविस्तार वर्णन कीजिए। इसके क्या परिणाम एवं प्रभाव पड़े?",
            questionEnglish = "Describe the incident of the Jallianwala Bagh massacre in detail. What were its consequences and impacts?",
            answerHindi = "जलियांवाला बाग हत्याकांड (13 अप्रैल 1919):\n\n1. पृष्ठभूमि:\n- अमृतसर (पंजाब) में रौलट एक्ट के विरोध में डॉ. सत्यपाल और डॉ. सैफुद्दीन किचलू की गिरफ्तारी के विरोध में तथा वार्षिक बैसाखी मेले में शामिल होने के लिए 13 अप्रैल 1919 को जलियांवाला बाग में भारी भीड़ जमा हुई थी।\n- शहर में मार्शल लॉ लागू था, जिसकी जानकारी गाँव से आए अधिकांश लोगों को नहीं थी।\n\n2. घटना:\n- जनरल डायर ने अपने हथियारबंद सैनिकों के साथ बाग के एकमात्र संकरे निकास द्वार को बंद कर दिया और बिना किसी चेतावनी के निहत्थी भीड़ पर अंधाधुंध गोलियाँ चलवा दीं।\n- सैकड़ों निर्दोष लोग मारे गए और हजारों गंभीर रूप से घायल हुए।\n\n3. परिणाम एवं प्रभाव:\n(i) पूरे देश में आक्रोश की लहर फैल गई; रवींद्रनाथ टैगोर ने विरोध स्वरूप अपनी 'नाइटहुड' (Knighthood) की उपाधि त्याग दी।\n(ii) महात्मा गांधी ने रौलट सत्याग्रह को वापस लिया और बड़े पैमाने पर हिंदू-मुस्लिम एकता के साथ 'असहयोग आंदोलन' (1920) शुरू करने का निर्णय लिया।\n(iii) ब्रिटिश साम्राज्य की क्रूरता पूरी दुनिया के सामने उजागर हो गई।",
            answerEnglish = "Jallianwala Bagh Massacre (13 April 1919):\n- A large peaceful crowd had gathered at Jallianwala Bagh in Amritsar to protest against the arrest of leaders and to attend the Baisakhi fair.\n- General Dyer blocked the only narrow exit point and opened fire on the unarmed crowd without warning, killing hundreds.\nImpact:\n- Rabindranath Tagore renounced his Knighthood.\n- Led directly to the launch of the Non-Cooperation Movement (1920) under Mahatma Gandhi.",
            solutionSteps = listOf(
                "तारीख (13 अप्रैल 1919) एवं स्थान (अमृतसर) लिखें।",
                "रौलट एक्ट एवं सभा का कारण स्पष्ट करें।",
                "जनरल डायर की क्रूर कार्रवाई का उल्लेख करें।",
                "नाइटहुड वापसी एवं असहयोग आंदोलन के सूत्रपात का प्रभाव लिखें।"
            ),
            keyFormulasOrPoints = listOf("13 April 1919 - General Dyer", "Rowlatt Act protest", "Rabindranath Tagore surrendered Knighthood"),
            examTip = "JAC 10वीं बोर्ड में जलियांवाला बाग या चौरी-चौरा कांड में से एक प्रश्न हर 2 साल में अवश्य आता है।"
        ),
        PyqQuestion(
            id = "q_10_sst_hist_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_hist",
            chapterId = "c10_sst_hist_ch2",
            chapterName = "भारत में राष्ट्रवाद",
            year = 2023,
            questionNo = 7,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "गांधीजी ने असहयोग आंदोलन को वापस लेने का निर्णय क्यों लिया?",
            questionEnglish = "Why did Mahatma Gandhi decide to withdraw the Non-Cooperation Movement?",
            answerHindi = "गांधीजी ने फरवरी 1922 में असहयोग आंदोलन वापस लेने का निर्णय निम्नलिखित मुख्य कारणों से लिया:\n1. चौरी-चौरा की हिंसक घटना (5 फरवरी 1922): उत्तर प्रदेश के गोरखपुर जिले के चौरी-चौरा में शांतिपूर्ण जुलूस पर पुलिस द्वारा गोली चलाने के बाद उग्र भीड़ ने थाने में आग लगा दी, जिसमें 22 पुलिसकर्मी जिंदा जल गए।\n2. अहिंसा के सिद्धांत का उल्लंघन: गांधीजी का मानना था कि सत्याग्रहियों को किसी भी बड़े जन-आंदोलन के लिए पूरी तरह अहिंसक प्रशिक्षण की आवश्यकता है।\n3. आंदोलन का हिंसक मोड़ लेना: कई स्थानों पर आंदोलन दिशाहीन होकर हिंसक हो रहा था, जिससे दमन का खतरा बढ़ गया था।",
            answerEnglish = "Reasons for withdrawal of Non-Cooperation Movement:\n1. Chauri Chaura incident (February 1922) where an enraged crowd burnt down a police station killing 22 policemen.\n2. Gandhi felt that the movement was turning violent in many places and satyagrahis needed to be properly trained before mass struggles.",
            solutionSteps = listOf(
                "चौरी-चौरा कांड (5 फरवरी 1922) का स्पष्ट उल्लेख करें।",
                "गांधीजी का अहिंसा का दृढ़ सिद्धांत समझाएं।",
                "सत्याग्रहियों के प्रशिक्षण की आवश्यकता बताएं।"
            ),
            keyFormulasOrPoints = listOf("Chauri Chaura - 5 Feb 1922 (Gorakhpur)", "Withdrawal in Feb 1922"),
            examTip = "चौरी-चौरा की तारीख (फरवरी 1922) और गोरखपुर का नाम उत्तर में अवश्य लिखें।"
        ),

        // ==================== CLASS 10 SOCIAL SCIENCE - BOOK 2: GEOGRAPHY (भूगोल) ====================
        PyqQuestion(
            id = "q_10_sst_geo_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_geo",
            chapterId = "c10_sst_geo_ch1",
            chapterName = "संसाधन एवं विकास",
            year = 2024,
            questionNo = 6,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "जलोढ़ मृदा (Alluvial Soil) और काली मृदा (Black Soil) में कोई तीन मुख्य अंतर स्पष्ट कीजिए।",
            questionEnglish = "State any three main differences between Alluvial Soil and Black Soil.",
            answerHindi = "जलोढ़ मृदा और काली मृदा में प्रमुख अंतर:\n\n1. निर्माण:\n- जलोढ़ मृदा: नदियों (सिंधु, गंगा, ब्रह्मपुत्र) द्वारा लाए गए निक्षेपों (गाद) से बनती है।\n- काली मृदा: ज्वालामुखी लावा के अपक्षय (बेसाल्ट चट्टानों) से बनती है।\n\n2. उपयुक्त फसलें:\n- जलोढ़ मृदा: धान, गेहूं, गन्ना, दलहन और तिलहन की खेती के लिए अत्यंत उपयुक्त।\n- काली मृदा: मुख्य रूप से कपास (Cotton) और मूंगफली की खेती के लिए सर्वोत्तम (इसे 'रेगुर मृदा' भी कहते हैं)।\n\n3. विस्तार क्षेत्र:\n- जलोढ़ मृदा: उत्तरी मैदान (पंजाब, UP, बिहार, प. बंगाल) और तटीय मैदान।\n- काली मृदा: दक्कन का पठार (महाराष्ट्र, गुजरात, मध्य प्रदेश)।",
            answerEnglish = "Differences between Alluvial and Black Soil:\n1. Origin: Alluvial is deposited by rivers (Indus, Ganga, Brahmaputra); Black soil is formed from volcanic basalt lava rocks.\n2. Crops: Alluvial is suitable for rice, wheat, sugarcane; Black soil (Regur) is ideal for cotton.\n3. Distribution: Northern plains for Alluvial; Deccan plateau (Maharashtra, Gujarat, MP) for Black soil.",
            solutionSteps = listOf(
                "पहला बिंदु: निर्माण (निक्षेप बनाम लावा शैल)।",
                "दूसरा बिंदु: उपयुक्त फसल (अन्न बनाम कपास)।",
                "तीसरा बिंदु: भौगोलिक क्षेत्र (उत्तरी मैदान बनाम दक्कन ट्रैप)।"
            ),
            keyFormulasOrPoints = listOf("Regur Soil = Black Soil = Cotton", "Alluvial = Bangar (Old) + Khadar (New)"),
            examTip = "काली मिट्टी का दूसरा नाम 'रेगुर' है, यह JAC में 1 अंक में अलग से भी पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sst_geo_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_geo",
            chapterId = "c10_sst_geo_ch4",
            chapterName = "कृषि",
            year = 2024,
            questionNo = 2,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "निम्नलिखित में से कौन सी एक खरीफ (Kharif) की प्रमुख फसल है?",
            questionEnglish = "Which of the following is a major Kharif crop?",
            options = listOf("चावल (धान / Paddy)", "गेहूं (Wheat)", "चना (Gram)", "सरसों (Mustard)"),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) चावल (धान / Paddy)\nखरीफ फसलें मानसून के आगमन (जून-जुलाई) के साथ बोई जाती हैं और सितंबर-अक्टूबर में काटी जाती हैं। उदाहरण: चावल (धान), मक्का, ज्वार, बाजरा, कपास। (गेहूं, चना और सरसों रबी की फसलें हैं)।",
            answerEnglish = "Correct Answer: (A) Rice (Paddy)\nKharif crops are sown with the onset of monsoon (June-July) and harvested in September-October. Examples: Paddy, maize, jowar, cotton.",
            solutionSteps = listOf(
                "खरीफ फसल की बुआई का समय: जून-जुलाई (मानसून)।",
                "प्रमुख खरीफ: चावल, मक्का, कपास।",
                "रबी फसलें: गेहूं, चना, सरसों (अक्टूबर-दिसंबर में बुआई)।"
            ),
            keyFormulasOrPoints = listOf("Kharif: Paddy, Maize, Cotton", "Rabi: Wheat, Gram, Mustard"),
            examTip = "रबी, खरीफ और जायद (तरबूज, खीरा) का अंतर JAC बोर्ड का पसंदीदा प्रश्न है।"
        ),
        PyqQuestion(
            id = "q_10_sst_geo_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_geo",
            chapterId = "c10_sst_geo_ch3",
            chapterName = "जल संसाधन",
            year = 2023,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "बहुउद्देशीय नदी घाटी परियोजनाओं से आप क्या समझते हैं? इनके प्रमुख लाभ और इनसे होने वाली हानियों (पर्यावरणीय समस्याओं) का उल्लेख कीजिए।",
            questionEnglish = "What do you understand by multipurpose river valley projects? State their major advantages and disadvantages.",
            answerHindi = "बहुउद्देशीय नदी घाटी परियोजनाएं:\nवे विशाल बांध और नदी परियोजनाएं जिनसे एक साथ कई उद्देश्यों (जैसे सिंचाई, बिजली उत्पादन, बाढ़ नियंत्रण) की पूर्ति की जाती है, उन्हें बहुउद्देशीय परियोजनाएं कहते हैं। पंडित नेहरू ने इन्हें 'आधुनिक भारत के मंदिर' कहा था।\n\nप्रमुख लाभ (Advantages):\n1. जलविद्युत उत्पादन: प्रदूषण रहित सस्ती बिजली मिलती है।\n2. सिंचाई की सुविधा: नहरों द्वारा सूखे क्षेत्रों तक जल पहुंचाया जाता है।\n3. बाढ़ नियंत्रण: भारी वर्षा में अतिरिक्त जल को बांधों में रोककर बाढ़ से बचाव होता है।\n4. मत्स्य पालन, अंतर्देशीय नौपरिवहन एवं पर्यटन का विकास।\n\nप्रमुख हानियां एवं समस्याएं (Disadvantages):\n1. स्थानीय लोगों का विस्थापन: लाखों आदिवासियों और ग्रामीणों को अपनी भूमि से बेदखल होना पड़ता है।\n2. वनों व जैव विविधता का विनाश: विशाल वन क्षेत्र जलमग्न होकर नष्ट हो जाते हैं।\n3. भूकंप का खतरा एवं तलछट जमाव: जलाशयों में अत्यधिक गाद जमने से तलछट का प्राकृतिक बहाव रुक जाता है।",
            answerEnglish = "Multipurpose River Valley Projects serve multiple purposes simultaneously: hydro-power, irrigation, flood control, fish breeding.\nAdvantages: Electricity, canals for farming, flood mitigation.\nDisadvantages: Displacement of indigenous communities, submergence of forests, loss of aquatic life, reservoir induced seismicity.",
            solutionSteps = listOf(
                "बहुउद्देशीय परियोजना की सटीक परिभाषा लिखें।",
                "नेहरू जी का कथन (आधुनिक भारत के मंदिर) कोट करें।",
                "चार लाभ (बिजली, सिंचाई, बाढ़ नियंत्रण, मत्स्य) लिखें।",
                "तीन हानियां (विस्थापन, पर्यावरण विनाश, गाद जमाव) लिखें।"
            ),
            keyFormulasOrPoints = listOf("Jawaharlal Nehru: 'Temples of modern India'", "Bhakra Nangal, Hirakud, Damodar Valley (DVC)"),
            examTip = "झारखंड की दामोदर घाटी परियोजना (DVC) भारत की पहली बहुउद्देशीय नदी घाटी परियोजना (1948) थी।"
        ),

        // ==================== CLASS 10 SOCIAL SCIENCE - BOOK 3: CIVICS (नागरिक शास्त्र) ====================
        PyqQuestion(
            id = "q_10_sst_civ_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_civ",
            chapterId = "c10_sst_civ_ch1",
            chapterName = "सत्ता की साझेदारी",
            year = 2024,
            questionNo = 13,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "सत्ता की साझेदारी क्यों आवश्यक है? इसके युक्तिपरक (Prudential) और नैतिक (Moral) तर्कों को समझाइए।",
            questionEnglish = "Why is power sharing desirable? Explain with prudential and moral reasons.",
            answerHindi = "सत्ता की साझेदारी का अर्थ है शासन की शक्तियों को विभिन्न स्तरों, अंगों और सामाजिक समूहों में विभाजित करना।\n\nसत्ता की साझेदारी के दो प्रमुख कारण हैं:\n\n1. युक्तिपरक तर्क (Prudential Reasons - समझदारी भरा कारण):\n- यह सामाजिक समूहों के बीच टकराव और हिंसा की संभावना को कम करता है।\n- राजनीतिक व्यवस्था में स्थिरता (Stability) बनाए रखने में मदद करता है।\n- बहुसंख्यकों का अल्पसंख्यकों पर अत्याचार रोकता है (जैसे श्रीलंका में बहुसंख्यकवाद ने गृहयुद्ध को जन्म दिया, जबकि बेल्जियम ने सत्ता साझा कर शांति स्थापित की)।\n\n2. नैतिक तर्क (Moral Reasons - लोकतांत्रिक मूल्य):\n- सत्ता की साझेदारी लोकतंत्र की 'आत्मा' (Spirit of Democracy) है।\n- लोकतंत्र का अर्थ ही यह है कि जो लोग सत्ता के नियमों से प्रभावित होते हैं, उनकी भागीदारी शासन व्यवस्था में अवश्य होनी चाहिए।\n- एक वैध सरकार वही है जहाँ नागरिक अपनी भागीदारी द्वारा शासन व्यवस्था से जुड़ते हैं।",
            answerEnglish = "Power sharing is essential for democratic stability:\n1. Prudential Reasons: Reduces possibility of conflict between social groups; ensures political stability; prevents majority tyranny (Belgian model vs Sri Lanka).\n2. Moral Reasons: Power sharing is the very spirit of democracy. Citizens have a right to be consulted on how they are to be governed.",
            solutionSteps = listOf(
                "सत्ता की साझेदारी की परिभाषा दें।",
                "युक्तिपरक तर्क: टकराव में कमी, राजनीतिक स्थिरता।",
                "नैतिक तर्क: लोकतंत्र की आत्मा, नागरिकों की भागीदारी।"
            ),
            keyFormulasOrPoints = listOf("Prudential = outcome-based (stability)", "Moral = spirit of democracy"),
            examTip = "बेल्जियम और श्रीलंका का उदाहरण देने से परीक्षक 5 में से पूरे 5 अंक देते हैं।"
        ),
        PyqQuestion(
            id = "q_10_sst_civ_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_civ",
            chapterId = "c10_sst_civ_ch6",
            chapterName = "राजनीतिक दल",
            year = 2024,
            questionNo = 3,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "भारत में राजनीतिक दलों को मान्यता और चुनाव चिह्न कौन प्रदान करता है?",
            questionEnglish = "Who recognizes political parties and allots election symbols in India?",
            options = listOf("भारत का चुनाव आयोग (Election Commission of India)", "भारत का संसद", "भारत के राष्ट्रपति", "भारत का सर्वोच्च न्यायालय"),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) भारत का चुनाव आयोग (Election Commission of India)\nभारतीय संविधान के अनुच्छेद 324 के अंतर्गत निर्वाचन आयोग सभी राजनीतिक दलों का पंजीकरण करता है, राष्ट्रीय/क्षेत्रीय दल का दर्जा देता है और उन्हें चुनाव चिह्न आवंटित करता है।",
            answerEnglish = "Correct Answer: (A) Election Commission of India\nUnder Article 324, the Election Commission of India registers parties, confers national/state status, and allots unique election symbols.",
            solutionSteps = listOf(
                "चुनाव आयोग (Election Commission) एक स्वायत्त संवैधानिक संस्था है।",
                "कार्य: चुनाव कराना, दलों को मान्यता देना, चुनाव चिह्न आवंटित करना।"
            ),
            keyFormulasOrPoints = listOf("Election Commission of India - Article 324", "National & Regional Parties"),
            examTip = "राजनीतिक दल के 3 अंग होते हैं: नेता, सक्रिय सदस्य, अनुयायी।"
        ),
        PyqQuestion(
            id = "q_10_sst_civ_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_civ",
            chapterId = "c10_sst_civ_ch2",
            chapterName = "संघवाद",
            year = 2023,
            questionNo = 8,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "संघीय शासन व्यवस्था (Federal System) और एकात्मक शासन व्यवस्था (Unitary System) में मुख्य अंतर स्पष्ट कीजिए।",
            questionEnglish = "Explain the main differences between a Federal system and a Unitary system of government.",
            answerHindi = "संघीय और एकात्मक शासन व्यवस्था में अंतर:\n\n1. सत्ता के स्तर:\n- संघीय व्यवस्था: सत्ता दो या अधिक स्तरों (जैसे केंद्र सरकार और राज्य सरकार) में बंटी होती है।\n- एकात्मक व्यवस्था: शासन का एक ही स्तर होता है या उप-इकाइयाँ केंद्र के अधीन होकर काम करती हैं।\n\n2. शक्तियों का स्रोत:\n- संघीय व्यवस्था: केंद्र और राज्यों की शक्तियां संविधान द्वारा स्पष्ट रूप से बंटी होती हैं। राज्य सरकार अपने अधिकारों के लिए केंद्र पर निर्भर नहीं होती (जैसे भारत, अमेरिका, बेल्जियम)।\n- एकात्मक व्यवस्था: केंद्र सरकार जब चाहे प्रांतीय सरकारों को आदेश दे सकती है या उनके अधिकार वापस ले सकती है (जैसे ब्रिटेन, श्रीलंका)।\n\n3. संविधान संशोधन:\n- संघीय व्यवस्था में दोनों स्तरों की सहमति आवश्यक होती है, जबकि एकात्मक में केंद्र अकेला संशोधन कर सकता है।",
            answerEnglish = "Differences:\n1. Federal: Power divided between central authority and constituent units (two or more levels, e.g. India, USA).\n2. Unitary: Either only one level of government or sub-units are subordinate to the central government (e.g. UK, Sri Lanka).",
            solutionSteps = listOf(
                "स्तरों की संख्या (दो या अधिक बनाम एक)।",
                "संविधान द्वारा शक्तियों का विभाजन समझाएं।",
                "उदाहरण दें (भारत/अमेरिका बनाम ब्रिटेन)।"
            ),
            keyFormulasOrPoints = listOf("Union List (97), State List (66), Concurrent List (47)", "73rd Amendment (Panchayati Raj)"),
            examTip = "भारतीय संविधान में 'संघीय' शब्द का प्रयोग नहीं है, इसे 'राज्यों का संघ' (Union of States) कहा गया है।"
        ),

        // ==================== CLASS 10 SOCIAL SCIENCE - BOOK 4: ECONOMICS (अर्थशास्त्र) ====================
        PyqQuestion(
            id = "q_10_sst_eco_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_eco",
            chapterId = "c10_sst_eco_ch2",
            chapterName = "भारतीय अर्थव्यवस्था के क्षेत्रक",
            year = 2024,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "प्रच्छन्न बेरोजगारी (छिपी हुई बेरोजगारी / Disguised Unemployment) से आप क्या समझते हैं? एक ग्रामीण उदाहरण देकर स्पष्ट कीजिए।",
            questionEnglish = "What do you understand by disguised unemployment? Explain with a rural example.",
            answerHindi = "प्रच्छन्न बेरोजगारी (छिपी हुई बेरोजगारी):\nवह स्थिति जिसमें किसी कार्य में आवश्यकता से अधिक लोग लगे होते हैं और यदि उनमें से कुछ लोगों को काम से हटा भी दिया जाए, तो भी कुल उत्पादन पर कोई प्रतिकूल प्रभाव नहीं पड़ता।\n\nग्रामीण उदाहरण:\nमान लीजिए एक किसान (जैसे लखन) के पास 2 हेक्टेयर का खेत है। उस खेत में खेती के लिए केवल 3 मजदूरों की आवश्यकता है, लेकिन उसके परिवार के सभी 5 सदस्य उसी खेत में काम करते हैं। यहाँ जो 2 अतिरिक्त लोग काम कर रहे हैं, वे 'प्रच्छन्न रूप से बेरोजगार' हैं। यदि वे दोनों किसी फैक्ट्री या अन्य काम में लग जाएं, तो खेत की उपज में कोई कमी नहीं आएगी और परिवार की आय भी बढ़ जाएगी।\n\nयह बेरोजगारी भारतीय कृषि क्षेत्र में व्यापक रूप से पाई जाती है।",
            answerEnglish = "Disguised unemployment is a situation where more people are engaged in a job than actually required. If a few workers are moved out, production remains unaffected.\nRural Example: A 2-hectare farm needing only 3 workers employs all 5 members of a family. The extra 2 workers are disguisedly unemployed.",
            solutionSteps = listOf(
                "परिभाषा: आवश्यकता से अधिक श्रमिकों का नियोजन।",
                "शून्य सीमांत उत्पादकता (Marginal productivity is zero) का उल्लेख।",
                "कृषि आधारित सटीक पारिवारिक उदाहरण दें।"
            ),
            keyFormulasOrPoints = listOf("Disguised Unemployment = Hidden Underemployment", "Common in Agriculture sector"),
            examTip = "प्रच्छन्न बेरोजगारी को 'अल्प बेरोजगारी' (Underemployment) भी कहा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_sst_eco_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_eco",
            chapterId = "c10_sst_eco_ch3",
            chapterName = "मुद्रा और साख",
            year = 2024,
            questionNo = 16,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "ऋण (साख) के औपचारिक और अनौपचारिक स्रोतों में क्या अंतर है? ग्रामीण क्षेत्रों में गरीब परिवारों के लिए औपचारिक ऋण क्यों आवश्यक है?",
            questionEnglish = "Differentiate between formal and informal sources of credit. Why is formal credit necessary for rural poor households?",
            answerHindi = "ऋण के औपचारिक और अनौपचारिक स्रोतों में अंतर:\n\n1. औपचारिक स्रोत (Formal Sources):\n- इसमें बैंक और सहकारी समितियां (Cooperative societies) शामिल हैं।\n- इन पर भारतीय रिजर्व बैंक (RBI) निगरानी रखता है।\n- ब्याज दर कम, उचित और निश्चित होती है।\n- ऋण लेने के लिए समर्थक ऋणाधार (Collateral/जमानत) और कागजी दस्तावेजों की आवश्यकता होती है।\n\n2. अनौपचारिक स्रोत (Informal Sources):\n- इसमें साहूकार, व्यापारी, मालिक, रिश्तेदार और मित्र शामिल हैं।\n- इन पर किसी संस्था या सरकार का कोई नियंत्रण नहीं होता।\n- ब्याज दर अत्यंत ऊंची और मनमानी होती है।\n- बिना कागजी कार्रवाई या जमानत के भी जान-पहचान पर ऋण मिल जाता है, लेकिन कर्जदार 'कर्ज-जाल' (Debt trap) में फंस जाता है।\n\nगरीबों के लिए औपचारिक ऋण क्यों आवश्यक है:\n1. साहूकारों के शोषण और ऊंचे ब्याज से सुरक्षा मिलती है।\n2. सस्ती ब्याज दर से किसान खाद, बीज, नलकूप लगा सकते हैं और छोटे व्यापारी अपना धंधा बढ़ा सकते हैं।\n3. देश के समावेशी आर्थिक विकास के लिए सस्ता और सुलभ ऋण अनिवार्य है।",
            answerEnglish = "Formal vs Informal Sources of Credit:\n1. Formal: Banks & Cooperatives; supervised by RBI; low interest rate; requires collateral.\n2. Informal: Moneylenders, traders, relatives; no supervision; exorbitant interest rates; leads to debt-trap.\nWhy formal credit is vital for poor:\n- Protects from exploitation.\n- Affordable credit enables investment in farming and small enterprises.",
            solutionSteps = listOf(
                "औपचारिक स्रोत: बैंक + सहकारी बैंक + RBI नियंत्रण + कम ब्याज।",
                "अनौपचारिक स्रोत: साहूकार + अनियंत्रित + अत्यधिक ब्याज।",
                "ग्रामीण गरीबों के लिए आवश्यकता: कर्ज-जाल से मुक्ति व विकास।"
            ),
            keyFormulasOrPoints = listOf("RBI supervises formal sector banks", "Informal leads to debt trap", "Collateral (समर्थक ऋणाधार)"),
            examTip = "JAC बोर्ड में औपचारिक बनाम अनौपचारिक ऋण का प्रश्न 5 अंक के दीर्घ उत्तरीय में बार-बार आता है।"
        ),
        PyqQuestion(
            id = "q_10_sst_eco_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_sst_eco",
            chapterId = "c10_sst_eco_ch3",
            chapterName = "मुद्रा और साख",
            year = 2023,
            questionNo = 10,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "स्वयं सहायता समूहों (Self Help Groups - SHG) के गठन के प्रमुख उद्देश्य क्या हैं?",
            questionEnglish = "What are the main objectives behind the formation of Self Help Groups (SHGs)?",
            answerHindi = "स्वयं सहायता समूह (SHG) के प्रमुख उद्देश्य:\n1. ग्रामीण गरीबों, विशेषकर महिलाओं को 15-20 सदस्यों के छोटे समूहों में संगठित करना।\n2. नियमित रूप से छोटी-छोटी बचत (रु 25-100 प्रति सदस्य) एकत्र करके बचत की आदत डालना।\n3. सदस्यों को बिना समर्थक ऋणाधार (बिना किसी जमानत/गारंटी) के कम ब्याज दर पर तुरंत छोटे ऋण उपलब्ध कराना।\n4. नियमित बचत के बाद बैंकों से समूह के नाम पर ऋण प्राप्त कर स्वरोजगार के अवसर पैदा करना (जैसे सिलाई, पशुपालन, दुकान)।\n5. महिलाओं को आत्मनिर्भर बनाना और सामाजिक मुद्दों (स्वास्थ्य, पोषण, घरेलू हिंसा) पर चर्चा का मंच प्रदान करना।",
            answerEnglish = "Objectives of Self Help Groups (SHGs):\n1. Organize rural poor, particularly women, into small groups (15-20 members).\n2. Pool regular small savings to build collective capital.\n3. Provide collateral-free emergency loans at low interest rates.\n4. Enable women to become financially self-reliant and create micro-enterprises.",
            solutionSteps = listOf(
                "सदस्य संख्या (15-20) और नियमित बचत का उल्लेख करें।",
                "बिना ऋणाधार के ऋण मिलने की सुविधा बताएं।",
                "महिलाओं के सशक्तिकरण का बिंदु जोड़ें।"
            ),
            keyFormulasOrPoints = listOf("15-20 members, usually rural women", "Collateral-free micro loans", "Financial inclusion"),
            examTip = "झारखंड में 'सखी मंडल' (JSLPS) स्वयं सहायता समूह (SHG) का एक सफल उदाहरण है।"
        ),

        // ==================== CLASS 10 HINDI - BOOK 1: क्षितिज भाग - 2 (KSHITIJ BHAG 2) ====================
        PyqQuestion(
            id = "q_10_hin_ksh_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kshitij",
            chapterId = "c10_hin_kshitij_ch1",
            chapterName = "पद (सूरदास)",
            year = 2024,
            questionNo = 7,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "गोपियों द्वारा उद्धव को 'बड़भागी' कहने में क्या व्यंग्य निहित है? गोपियों ने श्रीकृष्ण के प्रति अपने अनन्य प्रेम की तुलना किससे की है?",
            questionEnglish = "What irony is hidden in the Gopis calling Uddhav 'Badbhagi' (fortunate)? With what have the Gopis compared their exclusive love for Krishna?",
            answerHindi = "1. 'बड़भागी' कहने में निहित व्यंग्य:\nगोपियाँ उद्धव को प्रत्यक्ष रूप में भाग्यशाली (बड़भागी) कह रही हैं, परंतु वास्तव में वे उन पर तीखा व्यंग्य कर रही हैं कि वे अति अभागे हैं। क्योंकि प्रेम के साक्षात सागर श्रीकृष्ण के समीप रहकर भी उनके मन में प्रेम का अंकुर नहीं फूटा। वे ठीक उसी प्रकार निर्लिप्त रहे जैसे जल में रहने पर भी कमल का पत्ता जल से अछूता रहता है (पुरइनि पात रहत जल भीतर, ता रस देह न दागी)।\n\n2. अनन्य प्रेम की तुलना:\nगोपियों ने अपने प्रेम की तुलना:\n(क) गुड़ से चिपटी चींटियों से की है (गुर चाँटी ज्यौं पागी) - जिस प्रकार चींटी गुड़ से लिपट जाती है और वहीं प्राण त्याग देती है।\n(ख) हारिल पक्षी की लकड़ी से की है - जिस प्रकार हारिल पक्षी अपने पंजों में पकड़ी लकड़ी को कभी नहीं छोड़ता, वैसे ही गोपियों ने मन, कर्म और वचन से कृष्ण को अपने हृदय में धारण कर रखा है।",
            answerEnglish = "1. Irony in Badbhagi: Gopis outwardly praise Uddhav as fortunate, but sarcastically mean he is unfortunate because living close to Krishna, the ocean of love, he never experienced love.\n2. Comparison: Like ants stuck to jaggery who die rather than leave, and like Haril bird clutching wooden twig.",
            solutionSteps = listOf(
                "व्यंग्य स्पष्ट करें: भाग्यशाली कहकर अभागा सिद्ध करना।",
                "कमल के पत्ते और तेल की गगरी का उदाहरण दें।",
                "गुड़-चींटी और हारिल पक्षी की लकड़ी के उदाहरण से अनन्य भक्ति समझाएं।"
            ),
            keyFormulasOrPoints = listOf("व्यंग्य: 'अति बड़भागी' = परम अभागा", "गुर चाँटी ज्यौं पागी", "हारिल की लकरी"),
            examTip = "JAC मैट्रिक बोर्ड में 'उद्धव-गोपी संवाद' और 'योग संदेश की कड़वी ककड़ी से तुलना' प्रश्न लगभग हर वर्ष आता है।"
        ),
        PyqQuestion(
            id = "q_10_hin_ksh_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kshitij",
            chapterId = "c10_hin_kshitij_ch10",
            chapterName = "नेताजी का चश्मा (स्वयं प्रकाश)",
            year = 2024,
            questionNo = 11,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "सेनानी न होते हुए भी चश्मेवाले को लोग 'कैप्टन' क्यों कहते थे? हालदार साहब पहले मायूस क्यों हुए थे और फिर नेताजी की मूर्ति पर सरकंडे का चश्मा देखकर उनकी आँखें क्यों भर आईं?",
            questionEnglish = "Why did people call the eyeglass seller 'Captain' even though he was not a soldier? Why was Haldar Sahib disappointed at first and why did his eyes tear up seeing the reed glasses on Netaji's statue?",
            answerHindi = "1. 'कैप्टन' कहने का कारण:\nचश्मेवाला एक बूढ़ा, लंगड़ा और अत्यंत निर्धन फेरीवाला था, जो कभी सेना या आज़ाद हिंद फ़ौज में नहीं रहा था। फिर भी लोग उसे 'कैप्टन' इसलिए कहते थे क्योंकि उसके हृदय में देश के अमर शहीदों और देशभक्तों के प्रति अगाध श्रद्धा व देशभक्ति थी। उसे नेताजी सुभाष चंद्र बोस की बिना चश्मे वाली मूर्ति अधूरी और आहत करने वाली लगती थी। वह अपने सीमित साधनों में से अपनी चौखटों में से एक चश्मा नेताजी की मूर्ति पर अवश्य लगा देता था।\n\n2. हालदार साहब की मायूसी का कारण:\nजब हालदार साहब को पता चला कि कैप्टन मर चुका है, तो वे मायूस हो गए कि अब उस कस्बे में नेताजी की मूर्ति पर चश्मा लगाने वाला कोई नहीं बचा। भावी पीढ़ी में देशभक्ति का अभाव देखकर वे दुखी थे।\n\n3. आँखें भर आने का कारण:\nअगली बार जब वे कस्बे से गुजरे, तो उन्होंने देखा कि नेताजी की आँखों पर किसी बच्चे द्वारा सरकंडे का छोटा सा चश्मा बनाकर लगाया गया है। यह देखकर हालदार साहब भाव-विभोर हो गए और उनकी आँखें भर आईं क्योंकि उन्हें विश्वास हो गया कि हमारे देश की नई पीढ़ी (बच्चों) के दिलों में भी देशभक्ति जीवित है। देश का भविष्य सुरक्षित है।",
            answerEnglish = "1. Captain: Respected for intense patriotism and devotion to Netaji despite extreme poverty.\n2. Sadness: Captain passed away and nobody seemed to care for the statue.\n3. Emotional tears: Saw a reed spectacle made by innocent children on the statue, realizing patriotism is alive in the future generation.",
            solutionSteps = listOf(
                "कैप्टन की देशभक्ति और संवेदनशीलता का वर्णन करें।",
                "कैप्टन की मृत्यु पर हालदार साहब की चिंता लिखें।",
                "सरकंडे का चश्मा = नई पीढ़ी की देशभक्ति का प्रतीक, भावुक होने का कारण।"
            ),
            keyFormulasOrPoints = listOf("कैप्टन = सच्चा देशभक्त", "सरकंडे का चश्मा = नई पीढ़ी में जीवित देशभक्ति"),
            examTip = "नेताजी का चश्मा पाठ यह संदेश देता है कि देश केवल सीमाओं से नहीं, बल्कि नागरिकों के प्रेम और योगदान से बनता है।"
        ),
        PyqQuestion(
            id = "q_10_hin_ksh_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kshitij",
            chapterId = "c10_hin_kshitij_ch11",
            chapterName = "बालगोबिन भगत (रामवृक्ष बेनीपुरी)",
            year = 2023,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "बालगोबिन भगत की दिनचर्या लोगों के अचरज का कारण क्यों थी? पुत्र की मृत्यु पर उन्होंने अपनी भावनाएं कैसे व्यक्त कीं?",
            questionEnglish = "Why was Balgobin Bhagat's daily routine a matter of wonder for people? How did he express his feelings upon his son's death?",
            answerHindi = "1. दिनचर्या लोगों के अचरज का कारण:\nबालगोबिन भगत वृद्ध होते हुए भी अत्यंत कठोर नियम-संयम का पालन करते थे। चाहे माघ की दांत किटकिटाने वाली ठंड हो, वे भोर में तारों की छांव में दो मील दूर नदी स्नान करने जाते थे। लौटकर पोखरे के ऊंचे भिंडे पर अपनी खंजड़ी लेकर कबीर के पद गाने लगते थे। आषाढ़ की रिमझिम में कीचड़ से लथपथ होकर खेतों में धान की रोपनी करते हुए उनका मधुर गायन सबको मंत्रमुग्ध कर देता था। बिना पूछे किसी की वस्तु न छूना और कभी झूठ न बोलना उनकी विशेषता थी।\n\n2. पुत्र की मृत्यु पर भावनाएँ:\nजब उनके इकलौते सुस्त और बोदा बेटे की मृत्यु हुई, तो भगत जी रोने के बजाय उत्सव मनाने लगे। उन्होंने बेटे के शव को आंगन में सफेद चादर से ढक दिया, फूल बिखरा दिए और उसके सिरहाने दीपक जलाकर खंजड़ी बजाते हुए कबीर के पद गाने लगे। उन्होंने अपनी विलाप करती पतोहू (बहू) से कहा कि यह रोने का नहीं बल्कि आनंद का समय है, क्योंकि विरहिणी आत्मा अपने प्रियतम परमात्मा से जा मिली है।",
            answerEnglish = "1. Wonder: Strict discipline, bathing in freezing river at dawn, singing Kabir's songs passionately, farming with devotion.\n2. Son's death: Celebrated instead of mourning, stating the soul has united with God; asked daughter-in-law to celebrate and later arranged her remarriage.",
            solutionSteps = listOf(
                "नियम-निष्ठा: भोर का स्नान, खंजड़ी वादन, सत्यवादिता।",
                "पुत्र-शोक में अध्यात्म: आत्मा का परमात्मा से मिलन।",
                "सामाजिक क्रांति: बहू का पुनर्विवाह कराने का साहसिक कदम।"
            ),
            keyFormulasOrPoints = listOf("कबीरपंथी गृहस्थ साधु", "आत्मा-परमात्मा का मिलन", "कुप्रथाओं पर प्रहार (विधवा पुनर्विवाह)"),
            examTip = "बालगोबिन भगत 'गृहस्थ होते हुए भी सच्चे संन्यासी थे' - यह प्रश्न बार-बार दोहराया जाता है।"
        ),
        PyqQuestion(
            id = "q_10_hin_ksh_2023_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kshitij",
            chapterId = "c10_hin_kshitij_ch2",
            chapterName = "राम-लक्ष्मण-परशुराम संवाद (तुलसीदास)",
            year = 2023,
            questionNo = 6,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "परशुराम के क्रोध करने पर लक्ष्मण ने धनुष के टूट जाने के लिए कौन-कौन से तर्क दिए?",
            questionEnglish = "What arguments did Lakshmana give for the breaking of the bow when Parashurama became angry?",
            answerHindi = "लक्ष्मण ने हँसकर परशुराम जी को निम्नलिखित तर्क दिए:\n1. हमने बचपन में खेल-खेल में ऐसी न जाने कितनी धनुहियाँ (छोटे धनुष) तोड़ी हैं, तब तो मुनिवर ने कभी ऐसा क्रोध नहीं किया। इस पुराने धनुष पर ही आपकी इतनी ममता क्यों है?\n2. हमारी दृष्टि में तो सभी धनुष एक समान होते हैं। इस पुराने, जीर्ण-शीर्ण धनुष के टूटने से किसी को क्या लाभ या क्या हानि हो सकती है?\n3. श्रीराम ने तो इसे नए धनुष के धोखे में केवल छुआ भर था। यह तो अत्यंत पुराना और कमजोर था, जो श्रीराम के छूते ही टूट गया। इसमें रघुपति (श्रीराम) का कोई दोष नहीं है (छुअत टूट रघुपतिहु न दोसू, मुनि बिनु काज करिअ कत रोसू)।",
            answerEnglish = "Lakshmana argued:\n1. Broken many small bows in childhood, no sage got angry then.\n2. All bows are equal; what loss or gain in breaking a rotten old bow?\n3. Rama just touched it thinking it was new, and it broke on its own due to decay without Rama's fault.",
            solutionSteps = listOf(
                "बचपन की धनुहियों का संदर्भ दें।",
                "पुराने धनुष के टूटने पर लाभ-हानि न होने का तर्क।",
                "श्रीराम के निर्दोष होने का तर्क (छुअत टूट)।"
            ),
            keyFormulasOrPoints = listOf("बहु धनुही तोरी लरिकाईं", "का छति लाभु जून धनु तोरें", "छुअत टूट रघुपतिहु न दोसू"),
            examTip = "लक्ष्मण के चरित्र की दो विशेषताएं: निडरता और हाजिरजवाबी (व्यंग्यपटुता)।"
        ),

        // ==================== CLASS 10 HINDI - BOOK 2: कृतिका भाग - 2 (KRITIKA BHAG 2) ====================
        PyqQuestion(
            id = "q_10_hin_krt_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kritika",
            chapterId = "c10_hin_kritika_ch1",
            chapterName = "माता का अँचल (शिवपूजन सहाय)",
            year = 2024,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "भोलानाथ का अपने पिता से अधिक लगाव था, फिर भी विपत्ति के समय वह पिता के पास न जाकर माता की शरण में क्यों गया? 'माता का अँचल' शीर्षक की सार्थकता स्पष्ट कीजिए।",
            questionEnglish = "Bholanath was more attached to his father, yet why did he run to his mother during distress rather than his father? Explain the appropriateness of the title 'Mata Ka Anchal'.",
            answerHindi = "1. संकट के समय माता की शरण में जाने का कारण:\nभोलानाथ का अधिकांश समय पिता के साथ बीतता था—पिता ही नहलाते, पूजा में बिठाते, साथ खाना खिलाते और खेलों में शामिल होते थे। परंतु जब बच्चों ने टीले पर चूहों के बिल में पानी उलीचा और वहाँ से एक भयंकर काला सांप निकल आया, तो बच्चे जान बचाकर बेतहाशा भागे।\nकांटों से लथपथ, हांफता हुआ भोलानाथ जब घर पहुंचा, तो उसके पिता बरामदे में हुक्का पी रहे थे और पुकारते रहे। लेकिन बालक पिता को अनदेखा कर सीधे भीतर अपनी मां के पास गया और उसके आंचल में छिपकर थर-थर कांपने लगा। ऐसा इसलिए क्योंकि बच्चे को पिता से खेल और दुलार तो मिलता है, लेकिन जो असीम सुरक्षा, ममता, सांत्वना और आत्मीय शांति मां के आंचल में मिलती है, वह कहीं और नहीं मिल सकती। मां की गोद बालक के लिए रक्षा कवच जैसी है।\n\n2. शीर्षक की सार्थकता:\n'माता का अँचल' शीर्षक पूर्णतः सार्थक और सटीक है। उपन्यास 'देहाती दुनिया' का यह अंश दर्शाता है कि बच्चा चाहे पिता के कितना भी निकट हो, संकट के क्षणों में मां का आंचल ही उसका सबसे सुरक्षित ठिकाना होता है।",
            answerEnglish = "1. Reason: Father provided fun and games, but in extreme terror from the snake, mother's bosom provided absolute security, unconditional comfort, and healing touch.\n2. Title significance: Mother's lap (Anchal) is the ultimate sanctuary for a frightened child.",
            solutionSteps = listOf(
                "भोलानाथ का पिता के साथ घनिष्ठ संबंध बताएं।",
                "सांप के बिल की घटना और भयभीत होकर भागना।",
                "मां के आंचल में मिलने वाली असीम सुरक्षा और ममता का विश्लेषण करें।"
            ),
            keyFormulasOrPoints = listOf("देहाती दुनिया (शिवपूजन सहाय)", "पिता = सखा, माता = सुरक्षा व वात्सल्य की छांव"),
            examTip = "JAC बोर्ड में 'माता का अँचल' से ग्रामीण परिवेश और बाल मनोविज्ञान का प्रश्न 5 अंक में अनिवार्य रूप से आता है।"
        ),
        PyqQuestion(
            id = "q_10_hin_krt_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kritika",
            chapterId = "c10_hin_kritika_ch2",
            chapterName = "जॉर्ज पंचम की नाक (कमलेश्वर)",
            year = 2023,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "'जॉर्ज पंचम की नाक' पाठ में सरकारी तंत्र की किस गुलामी की मानसिकता पर तीखा व्यंग्य किया गया है? अंत में मूर्तिकार द्वारा जीवित व्यक्ति की नाक लगाने के निर्णय का क्या परिणाम हुआ?",
            questionEnglish = "What colonial slave mentality of the government machinery is satirized in 'George Pancham Ki Naak'? What was the consequence of the sculptor's decision to place a living person's nose?",
            answerHindi = "1. गुलामी की मानसिकता पर व्यंग्य:\nलेखक कमलेश्वर ने दर्शाया है कि देश को राजनीतिक आज़ादी मिले वर्षों बीत चुके हैं, लेकिन हमारे हुक्मरानों और सरकारी अधिकारियों के दिलों-दिमाग से अंग्रेज़ी हुकूमत की गुलामी नहीं गई है। जब इंग्लैंड की महारानी एलिज़ाबेथ द्वितीय भारत दौरे पर आने वाली थीं, तो दिल्ली की इंडिया गेट स्थित जॉर्ज पंचम की लाट (मूर्ति) की नाक गायब पाई गई। एक विदेशी आक्रांता और शोषक की मूर्ति की नाक बचाने के लिए पूरा सरकारी तंत्र परेशान हो गया। हमारे नेताओं ने अपने देश के शहीदों, बच्चों और यहाँ तक कि जीवित नागरिक की नाक (आत्मसम्मान) को जॉर्ज पंचम की नाक के आगे तुच्छ समझ लिया।\n\n2. जीवित नाक लगाने का निर्णय और परिणाम:\nजब देश भर के पहाड़ों और मूर्तियों की छानबीन के बाद भी कोई पत्थर या नाक मेल नहीं खाई, तो मूर्तिकार ने 40 करोड़ जीवित भारतीयों में से किसी एक की जिंदा नाक काटकर लगाने का घिनौना सुझाव दिया। अफसरों ने चुपचाप इसकी अनुमति दे दी।\nअगले दिन अखबारों में केवल एक पंक्ति छपी कि जॉर्ज पंचम की लाट को जिंदा नाक लगाई गई है। लेकिन विरोध और शर्म के कारण उस दिन देश भर में किसी भी उद्घाटन, सभा, अभिनंदन या स्वागत समारोह का आयोजन नहीं हुआ और सभी अखबार खाली रहे। यह समूचे राष्ट्र के आत्मसम्मान की हत्या पर मौन शोक था।",
            answerEnglish = "1. Satire: Colonial hangover where officials prioritized a tyrant king's stone nose over the self-respect of the nation.\n2. Consequence: A living citizen's nose was installed; newspapers remained silent in deep shame, cancelling all public events.",
            solutionSteps = listOf(
                "रानी एलिजाबेथ के दौरे और नाक गायब होने की समस्या।",
                "सरकारी तंत्र की चाटुकारिता और मानसिक दासता पर व्यंग्य।",
                "जिंदा नाक लगाना = आत्मसम्मान की बलि और मौन शोक।"
            ),
            keyFormulasOrPoints = listOf("नाक = मान-सम्मान व प्रतिष्ठा का प्रतीक", "औपनिवेशिक मानसिकता पर तीखा कटाक्ष"),
            examTip = "कमलेश्वर की यह कहानी व्यंग्य विधा की श्रेष्ठ रचनाओं में गिनी जाती है।"
        ),
        PyqQuestion(
            id = "q_10_hin_krt_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_hin_kritika",
            chapterId = "c10_hin_kritika_ch3",
            chapterName = "साना-साना हाथ जोड़ि... (मधु कांकरिया)",
            year = 2024,
            questionNo = 16,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "'साना-साना हाथ जोड़ि...' यात्रा वृतांत में लेखिका ने हिमालय के प्राकृतिक सौंदर्य के साथ-साथ वहाँ की श्रमशील नारियों के संघर्ष का किस प्रकार चित्रण किया है?",
            questionEnglish = "In the travelogue 'Sana-Sana Hath Jodi...', how has the author depicted the hard labor and struggle of Himalayan women alongside the breathtaking natural beauty?",
            answerHindi = "1. हिमालय का प्राकृतिक सौंदर्य:\nलेखिका मधु कांकरिया जब गंगटोक (सिक्किम) से युमथांग की ओर बढ़ती हैं, तो हिमालय के विराट और पल-पल बदलते रूप को देखकर विस्मित रह जाती हैं। तिस्ता नदी का तीव्र प्रवाह, बर्फ से ढकी चोटियां, फूलों से भरी घाटियां और बादलों का तैरना ऐसा लगता है मानो वे किसी देवभूमि में हों।\n\n2. श्रमशील नारियों का कठोर संघर्ष:\nपरंतु इस अप्रतिम सौंदर्य के बीच लेखिका को एक दिल दहलाने वाला यथार्थ दिखाई देता है। तीस्ता नदी के किनारे कठिन चढ़ाई वाले रास्तों पर कुछ पहाड़ी स्त्रियां कुदाल और हथौड़े से पत्थर तोड़ रही थीं। उनके कोमल हाथों में गांठें पड़ चुकी थीं और कई स्त्रियों की पीठ पर बंधी डोको (बड़ी टोकरी) में उनके छोटे-छोटे बच्चे बंधे हुए थे।\n\n3. मातृत्व और श्रम-साधना का समन्वय:\nयह दृश्य लेखिका को भीतर तक झकझोर देता है कि एक तरफ अपनी संतान का पालन-पोषण और दूसरी तरफ देश के दुर्गम पहाड़ी रास्तों को सुगम बनाने के लिए जानलेवा श्रम! लेखिका कहती हैं कि ये पहाड़ी औरतें केवल पत्थर नहीं तोड़ रहीं, बल्कि अपने अद्वितीय सौंदर्य और मातृत्व के साथ जीवन की कठिनतम चुनौतियों को परास्त कर रही हैं। वे समाज को कितना कुछ देती हैं और बदले में नाममात्र का पारिश्रमिक पाती हैं।",
            answerEnglish = "Author portrays sharp contrast between ethereal beauty of Himalayas and crushing poverty of women laborers breaking stones with babies tied on their backs, exhibiting breathtaking balance of motherhood and hard labor.",
            solutionSteps = listOf(
                "हिमालय के विहंगम प्राकृतिक सौंदर्य का वर्णन करें।",
                "रास्ते बनाते हुए पत्थर तोड़ती पहाड़ी स्त्रियों का चित्रण।",
                "मातृत्व और श्रम की असाधारण जुगलबंदी का विश्लेषण।"
            ),
            keyFormulasOrPoints = listOf("साना-साना हाथ जोड़ि = प्रार्थना (छोटे-छोटे हाथ जोड़कर)", "डोको = पीठ पर बंधी टोकरी", "कटाओ = भारत का स्विट्जरलैंड"),
            examTip = "कटाओ को पर्यटन स्थल के रूप में विज्ञापित न करने के कारण ही उसका प्राकृतिक सौंदर्य आज तक अक्षुण्ण है।"
        ),
        PyqQuestion(
            id = "q_12_phy_2024_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_phy",
            chapterId = "c12_phy_ch1",
            chapterName = "Electric Charges & Fields",
            year = 2024,
            questionNo = 1,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "निर्वात की विद्युतशीलता (Permittivity of free space, ε0) का SI मात्रक क्या होता है?",
            questionEnglish = "What is the SI unit of permittivity of free space (ε0)?",
            options = listOf("C² N⁻¹ m⁻²", "N m² C⁻²", "N C⁻¹ m", "C N⁻¹ m"),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) C² N⁻¹ m⁻² (या F m⁻¹)\nकूलॉम के नियम से: F = (1 / 4πε0) × (q1 q2 / r²)\n=> ε0 = (q1 q2) / (4π F r²)\nमात्रक = (Coulomb × Coulomb) / (Newton × metre²) = C² N⁻¹ m⁻²",
            answerEnglish = "Correct Answer: (A) C² N⁻¹ m⁻² (or Farad per metre)\nFrom Coulomb's Law: F = (1 / 4πε0) (q1 q2 / r²)\n=> ε0 = (q1 q2) / (F r²)\nUnit = (C × C) / (N × m²) = C² N⁻¹ m⁻².",
            solutionSteps = listOf(
                "कूलॉम का नियम लिखें: F = (1/4πε0) (q1 q2 / r²)",
                "ε0 को पृथक करें: ε0 = q² / (F r²)",
                "मात्रक प्रतिस्थापित करें: C² / (N m²) = C² N⁻¹ m⁻²"
            ),
            keyFormulasOrPoints = listOf("ε0 = 8.854 × 10⁻¹² C² N⁻¹ m⁻²", "विमीय सूत्र: [M⁻¹ L⁻³ T⁴ A²]"),
            examTip = "JAC 12वीं बोर्ड में ε0 का विमीय सूत्र (Dimensional Formula) भी बार-बार पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_12_phy_2024_02",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_phy",
            chapterId = "c12_phy_ch1",
            chapterName = "Electric Charges & Fields",
            year = 2024,
            questionNo = 11,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "गॉस के प्रमेय (Gauss's Theorem) का कथन लिखिए एवं इसे सिद्ध कीजिए। इसकी सहायता से अनंत लंबाई के एकसमान आवेशित सीधे तार के कारण विद्युत क्षेत्र की तीव्रता का व्यंजक प्राप्त कीजिए।",
            questionEnglish = "State and prove Gauss's Theorem in electrostatics. Using it, derive an expression for the electric field intensity due to an infinitely long straight uniformly charged wire.",
            answerHindi = "गॉस का प्रमेय (कथन):\nकिसी बंद पृष्ठ से गुजरने वाला कुल वैद्युत फ्लक्स (ΦE) उस पृष्ठ द्वारा परिबद्ध कुल आवेश (q) का 1/ε0 गुना होता है।\nअर्थात: ΦE = ∮ E · dA = q / ε0\n\nअनंत लंबाई के सीधे तार के कारण विद्युत क्षेत्र का निगमन:\nमाना तार पर रेखीय आवेश घनत्व λ है। r त्रिज्या और l लंबाई का एक बेलनाकार गॉसीय पृष्ठ (Cylindrical Gaussian surface) लेते हैं।\n\nफ्लक्स तीन पृष्ठों से होगा:\nΦ = Φ1 (समतल सिरा 1) + Φ2 (समतल सिरा 2) + Φ3 (वक्र पृष्ठ)\nसमतल सिरों पर E और dA लंबवत हैं (θ = 90°), अतः cos 90° = 0 => Φ1 = Φ2 = 0\nवक्र पृष्ठ पर E और dA समांतर हैं (θ = 0°):\nΦ = E × (2π r l)\n\nगॉस के प्रमेय से: Φ = q_in / ε0 = (λ l) / ε0\nअतः E × (2π r l) = (λ l) / ε0\n=> E = λ / (2π ε0 r)\nसदिश रूप में: E = (λ / 2π ε0 r) r̂",
            answerEnglish = "Gauss's Theorem:\nThe total electric flux through any closed surface is equal to 1/ε0 times the net charge enclosed inside the surface: ΦE = ∮ E · dA = q / ε0.\n\nDerivation for infinite straight wire:\nLet linear charge density be λ. Consider a cylindrical Gaussian surface of radius r and length l coaxial with the wire.\nTotal flux Φ = Φ_curved + Φ_ends.\nAt flat circular ends, E ⊥ dA => flux is zero.\nAt curved surface, E || dA everywhere => Φ = E × (2πrl).\nBy Gauss's theorem: Φ = q_enc / ε0 = (λl) / ε0.\nEquating both:\nE (2πrl) = (λl) / ε0\n=> E = λ / (2π ε0 r).",
            solutionSteps = listOf(
                "गॉस प्रमेय का सटीक कथन एवं सूत्र Φ = q/ε0 लिखें।",
                "बेलनाकार गॉसीय पृष्ठ की कल्पना करें।",
                "समतल सिरों पर फ्लक्स शून्य दिखाएँ (θ = 90°)।",
                "वक्र पृष्ठ का फ्लक्स E × 2πrl ज्ञात करें।",
                "गॉस प्रमेय से तुलना करके E = λ / (2πε0r) प्राप्त करें।"
            ),
            keyFormulasOrPoints = listOf("Φ = ∮ E · dA = q / ε0", "E = λ / (2π ε0 r) = (2kλ) / r", "E ∝ 1/r"),
            examTip = "JAC 12वीं भौतिकी में गॉस के अनुप्रयोग (अनंत तार या अनंत चादर) में से एक 5 अंक में अनिवार्य आता है।"
        ),
        PyqQuestion(
            id = "q_12_phy_2023_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_phy",
            chapterId = "c12_phy_ch14",
            chapterName = "Semiconductor Electronics",
            year = 2023,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "p-n संधि डायोड क्या है? एक पूर्ण तरंग दिष्टकारी (Full Wave Rectifier) के रूप में p-n संधि डायोड की कार्यप्रणाली का परिपथ आरेख बनाकर समझाइए। निवेशी और निर्गत तरंग रूप (Waveforms) भी खींचिए।",
            questionEnglish = "What is a p-n junction diode? Explain the working of a p-n junction diode as a full wave rectifier with the help of a circuit diagram. Draw input and output waveforms.",
            answerHindi = "p-n संधि डायोड:\nजब एक p-प्रकार के अर्धचालक को विशेष विधि द्वारा n-प्रकार के अर्धचालक से जोड़ा जाता है, तो संपर्क तल को p-n संधि कहते हैं।\n\nपूर्ण तरंग दिष्टकारी की कार्यविधि:\nइसमें मध्य-निष्कासी ट्रांसफार्मर (Center-tapped transformer) और दो डायोड (D1 और D2) का उपयोग किया जाता है।\n\n1. धनात्मक अर्ध-चक्र में: ट्रांसफार्मर का सिरा A धनात्मक तथा B ऋणात्मक होता है। डायोड D1 अग्र अभिनत (Forward biased) होकर चालन करता है जबकि D2 पश्च अभिनत (Reverse biased) होकर चालन नहीं करता। धारा लोड RL में X से Y की ओर बहती है।\n\n2. ऋणात्मक अर्ध-चक्र में: सिरा A ऋणात्मक तथा B धनात्मक हो जाता है। अब डायोड D1 पश्च अभिनत तथा D2 अग्र अभिनत होकर चालन करता है। धारा पुनः लोड RL में उसी दिशा (X से Y) में बहती है।\n\nपरिणामस्वरूप, लोड में दोनों अर्ध-चक्रों में एक ही दिशा में दिष्ट धारा प्राप्त होती है।\nदक्षता (Efficiency): लगभग 81.2%",
            answerEnglish = "A p-n junction diode is formed when a p-type semiconductor is joined to an n-type semiconductor.\n\nFull Wave Rectifier Working:\nUses a center-tapped transformer and two diodes (D1 and D2).\n- During positive half cycle: Diode D1 is forward biased and conducts while D2 is reverse biased. Current flows through load RL from X to Y.\n- During negative half cycle: Diode D2 is forward biased and conducts while D1 is reverse biased. Current still flows through RL in the same direction (X to Y).\nThus, AC input is converted into unidirectional pulsating DC output continuously.",
            solutionSteps = listOf(
                "परिपथ आरेख: सेंटर टैप ट्रांसफार्मर + 2 डायोड + लोड प्रतिरोध RL।",
                "धनात्मक अर्ध-चक्र की क्रियाविधि (D1 ON, D2 OFF)।",
                "ऋणात्मक अर्ध-चक्र की क्रियाविधि (D1 OFF, D2 ON)।",
                "इनपुट AC साइन वेव और आउटपुट स्पंदित DC वेवफॉर्म बनाएं।"
            ),
            keyFormulasOrPoints = listOf("Full wave efficiency η = 81.2%", "Ripple frequency = 2 × f_in (100 Hz in India)"),
            examTip = "JAC बोर्ड में दिष्टकारी (अर्ध तरंग या पूर्ण तरंग) का प्रश्न बार-बार दोहराया जाता है। वेवफॉर्म आरेख साफ बनाएं।"
        ),

        // ==================== CLASS 12 CHEMISTRY (SCIENCE) ====================
        PyqQuestion(
            id = "q_12_chem_2024_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_chem",
            chapterId = "c12_chem_ch1",
            chapterName = "Solutions",
            year = 2024,
            questionNo = 4,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "राउल्ट का नियम (Raoult's Law) लिखिए। आदर्श एवं अनादर्श विलयन में दो मुख्य अंतर स्पष्ट कीजिए।",
            questionEnglish = "State Raoult's Law. Differentiate between ideal and non-ideal solutions by giving two main points.",
            answerHindi = "राउल्ट का नियम:\nकिसी दिए गए ताप पर वाष्पशील द्रवों के विलयन में प्रत्येक घटक का आंशिक वाष्प दाब (p) उसके मोल अंश (x) के समानुपाती होता है।\np1 = p1° × x1  तथा  p2 = p2° × x2\n\nआदर्श विलयन बनाम अनादर्श विलयन:\n1. आदर्श विलयन सभी सांद्रताओं पर राउल्ट के नियम का पालन करते हैं, जबकि अनादर्श विलयन पालन नहीं करते।\n2. आदर्श विलयन में मिश्रण का एन्थैल्पी परिवर्तन ΔH_mix = 0 तथा आयतन परिवर्तन ΔV_mix = 0 होता है। अनादर्श विलयन में ΔH_mix ≠ 0 तथा ΔV_mix ≠ 0 होता है।",
            answerEnglish = "Raoult's Law:\nFor a solution of volatile liquids, the partial vapour pressure of each component in the solution is directly proportional to its mole fraction present in solution:\np1 = p1° × x1 and p2 = p2° × x2.\n\nDifferences:\n1. Ideal solutions obey Raoult's law over the entire range of concentration; non-ideal solutions do not.\n2. In ideal solutions, ΔH_mix = 0 and ΔV_mix = 0; whereas in non-ideal solutions ΔH_mix ≠ 0 and ΔV_mix ≠ 0.",
            solutionSteps = listOf(
                "राउल्ट के नियम का कथन एवं गणितीय सूत्र p = p° × x लिखें।",
                "आदर्श विलयन के लक्षण: राउल्ट नियम का पालन, ΔH_mix = 0, ΔV_mix = 0।",
                "अनादर्श विलयन के लक्षण: धनात्मक या ऋणात्मक विचलन।"
            ),
            keyFormulasOrPoints = listOf("p = p° × x", "Ideal: ΔH=0, ΔV=0", "A-B attraction = A-A attraction"),
            examTip = "अनादर्श विलयनों के धनात्मक एवं ऋणात्मक विचलन के उदाहरण (जैसे एथेनॉल + एसीटोन) भी याद रखें।"
        ),

        // ==================== CLASS 12 MATHEMATICS (SCIENCE) ====================
        PyqQuestion(
            id = "q_12_math_2024_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_math",
            chapterId = "c12_math_ch3",
            chapterName = "Matrices and Determinants",
            year = 2024,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "आव्यूह विधि (Matrix Method) का प्रयोग करके निम्नलिखित समीकरण निकाय को हल कीजिए:\n2x + 3y + 3z = 5\nx - 2y + z = -4\n3x - y - 2z = 3",
            questionEnglish = "Solve the following system of linear equations using matrix method:\n2x + 3y + 3z = 5\nx - 2y + z = -4\n3x - y - 2z = 3",
            answerHindi = "समीकरण निकाय को AX = B के रूप में लिखा जा सकता है:\nजहाँ A = [[2, 3, 3], [1, -2, 1], [3, -1, -2]], X = [x, y, z]^T, B = [5, -4, 3]^T\n\nचरण 1: सारणिक |A| का मान:\n|A| = 2(4 - (-1)) - 3(-2 - 3) + 3(-1 - (-6))\n|A| = 2(5) - 3(-5) + 3(5) = 10 + 15 + 15 = 40\nचूँकि |A| = 40 ≠ 0, अतः A व्युत्क्रमणीय है और निकाय का एक अद्वितीय हल है: X = A⁻¹ B\n\nचरण 2: सहखंडज (adj A) निकालना:\nसहखंड (Cofactors):\nA11 = +5, A12 = +5, A13 = +5\nA21 = 3, A22 = -13, A23 = 11\nA31 = 9, A32 = 1, A33 = -7\nadj A = [[5, 3, 9], [5, -13, 1], [5, 11, -7]]\n\nचरण 3: X = A⁻¹ B = (1/40) (adj A) B:\n[x] = (1/40) [5(5) + 3(-4) + 9(3)] = (1/40) [40] = 1\n[y] = (1/40) [5(5) - 13(-4) + 1(3)] = (1/40) [80] = 2\n[z] = (1/40) [5(5) + 11(-4) - 7(3)] = (1/40) [-40] = -1\n\nअतः अभीष्ट हल: x = 1, y = 2, z = -1",
            answerEnglish = "The system is written as AX = B.\n|A| = 2(4+1) - 3(-2-3) + 3(-1+6) = 10 + 15 + 15 = 40 ≠ 0.\nUnique solution exists: X = A⁻¹ B.\nCofactors matrix transposed gives adj A = [[5, 3, 9], [5, -13, 1], [5, 11, -7]].\nX = (1/40) × (adj A) × B\nx = 1, y = 2, z = -1.",
            solutionSteps = listOf(
                "AX = B के रूप में लिखें।",
                "सारणिक |A| की गणना करें (|A| = 40 ≠ 0)।",
                "सभी 9 सहखंड (cofactors) ज्ञात करें और adj A निकालें।",
                "X = (1/|A|) (adj A) B से गुणा करके x, y, z का मान प्राप्त करें।",
                "जाँच: x=1, y=2, z=-1 समीकरण में रखकर उत्तर सत्यापित करें।"
            ),
            keyFormulasOrPoints = listOf("X = A⁻¹ B", "A⁻¹ = (1/|A|) adj A"),
            examTip = "JAC 12वीं गणित बोर्ड परीक्षा में यह 5 अंक का निश्चित प्रश्न है। मानों को मूल समीकरण में रखकर हमेशा जांच लें।"
        ),
        PyqQuestion(
            id = "q_12_math_2023_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_math",
            chapterId = "c12_math_ch7",
            chapterName = "Integrals",
            year = 2023,
            questionNo = 12,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "मान ज्ञात कीजिए: ∫ [0 से π/2] (√sin x) / (√sin x + √cos x) dx",
            questionEnglish = "Evaluate the definite integral: ∫ [0 to π/2] (√sin x) / (√sin x + √cos x) dx",
            answerHindi = "माना I = ∫ [0 से π/2] (√sin x) / (√sin x + √cos x) dx  ... (समीकरण 1)\n\nनिश्चित समाकलन के प्रगुण का प्रयोग करने पर:\n∫ [0 से a] f(x) dx = ∫ [0 से a] f(a - x) dx\nयहाँ a = π/2 है, अतः x के स्थान पर (π/2 - x) रखने पर:\nI = ∫ [0 से π/2] [√sin(π/2 - x)] / [√sin(π/2 - x) + √cos(π/2 - x)] dx\nचूँकि sin(π/2 - x) = cos x तथा cos(π/2 - x) = sin x:\nI = ∫ [0 से π/2] (√cos x) / (√cos x + √sin x) dx  ... (समीकरण 2)\n\nसमीकरण (1) और (2) को जोड़ने पर:\n2I = ∫ [0 से π/2] 1 dx = [x] [0 से π/2] = π/2\nअतः I = π / 4 उत्तर।",
            answerEnglish = "Let I = ∫ [0 to π/2] (√sin x) / (√sin x + √cos x) dx  ...(1)\nUsing definite integral property: ∫ [0 to a] f(x) dx = ∫ [0 to a] f(a - x) dx.\nI = ∫ [0 to π/2] (√cos x) / (√cos x + √sin x) dx  ...(2)\nAdding (1) and (2): 2I = ∫ 1 dx = π/2 => I = π / 4.",
            solutionSteps = listOf(
                "समाकलन को I मानकर समीकरण (1) नाम दें।",
                "प्रगुण f(a-x) का प्रयोग करें।",
                "sin(π/2 - x) = cos x में बदलें और समीकरण (2) प्राप्त करें।",
                "दोनों समीकरणों को जोड़ें: 2I = ∫ 1 dx = π/2 => I = π/4"
            ),
            keyFormulasOrPoints = listOf("∫ [0 to a] f(x) dx = ∫ [0 to a] f(a - x) dx", "Result = π / 4"),
            examTip = "इस प्रकार के सभी प्रश्नों (tan, cot, sin^n, cos^n) का उत्तर हमेशा π/4 आता है।"
        ),

        // ==================== CLASS 12 ECONOMICS (SCIENCE STREAM) ====================
        PyqQuestion(
            id = "q_12_econ_2024_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_econ",
            chapterId = "c12_econ_ch2",
            chapterName = "Theory of Consumer Behaviour",
            year = 2024,
            questionNo = 2,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "जब कुल उपयोगिता (Total Utility, TU) अधिकतम होती है, तब सीमांत उपयोगिता (Marginal Utility, MU) कितनी होती है?",
            questionEnglish = "When Total Utility (TU) is maximum, what is Marginal Utility (MU)?",
            options = listOf("धनात्मक (Positive)", "शून्य (Zero)", "ऋणात्मक (Negative)", "अनंत (Infinite)"),
            correctOptionIndex = 1,
            answerHindi = "सही उत्तर: (B) शून्य (Zero)\nह्रासमान सीमांत उपयोगिता नियम (Law of Diminishing Marginal Utility) के अनुसार:\n1. जब TU बढ़ती है, MU धनात्मक होती है।\n2. जब TU अधिकतम (तृप्ति बिंदु) पर पहुँचती है, तब MU शून्य (0) हो जाती है।\n3. जब TU घटने लगती है, तब MU ऋणात्मक हो जाती है।",
            answerEnglish = "Correct Answer: (B) Zero\nAccording to the Law of Diminishing Marginal Utility:\n- When TU increases at a diminishing rate, MU is positive.\n- When TU reaches its maximum (point of satiety), MU becomes ZERO.\n- When TU declines, MU becomes negative.",
            solutionSteps = listOf(
                "TU और MU का संबंध समझें: MU = ΔTU / ΔQ",
                "अधिकतम TU पर ढाल (slope) शून्य होता है, अतः MU = 0",
                "इसे तृप्ति बिंदु (Point of Satiety) भी कहा जाता है।"
            ),
            keyFormulasOrPoints = listOf("MU = ΔTU / ΔQ", "TU max => MU = 0", "Point of Satiety"),
            examTip = "JAC बोर्ड में TU एवं MU के बीच संबंध पर बहुविकल्पीय या 3-अंक का प्रश्न हर साल पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_12_econ_2024_02",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_econ",
            chapterId = "c12_econ_ch2",
            chapterName = "Theory of Consumer Behaviour",
            year = 2024,
            questionNo = 10,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "माँग का नियम (Law of Demand) क्या है? इसके दो प्रमुख अपवाद बताइए।",
            questionEnglish = "What is the Law of Demand? State any two main exceptions to this law.",
            answerHindi = "माँग का नियम:\nअन्य बातें समान रहने पर (Ceteris Paribus), किसी वस्तु की कीमत (P) बढ़ने पर उसकी माँगी गई मात्रा (Q) घटती है और कीमत घटने पर माँगी गई मात्रा बढ़ती है। अर्थात कीमत और माँग में विपरीत (ऋणात्मक) संबंध होता है।\n\nअपवाद (Exceptions):\n1. गिफेन वस्तुएं (Giffen Goods): निम्न कोटि की वस्तुएं जिन पर आय का बड़ा भाग खर्च होता है; कीमत घटने पर गरीब उपभोक्ता इनकी माँग घटाकर अच्छी वस्तुएँ खरीदने लगते हैं।\n2. प्रतिष्ठासूचक या विलासिता की वस्तुएं (Veblen Goods): हीरे, बहुमूल्य रत्न, महंगी गाड़ियाँ—इनकी कीमत अधिक होने पर सामाजिक प्रतिष्ठा के लिए अधिक खरीदी जाती हैं।",
            answerEnglish = "Law of Demand:\nOther things being equal (Ceteris Paribus), there is an inverse relationship between the price of a commodity and its quantity demanded. As price rises, quantity demanded falls, and as price falls, quantity demanded rises.\n\nExceptions:\n1. Giffen Goods: Inferior goods where demand decreases when price decreases.\n2. Articles of Distinction / Veblen Goods: Luxury goods like diamonds, expensive cars whose demand increases with high price due to status symbol.",
            solutionSteps = listOf(
                "'अन्य बातें समान रहने पर' (Ceteris Paribus) वाक्यांश अनिवार्य है।",
                "कीमत और माँग में विपरीत संबंध (Dx = f(Px))।",
                "दो अपवाद: गिफेन वस्तुएं और विलासिता वस्तुएं।"
            ),
            keyFormulasOrPoints = listOf("Price ↑ => Demand ↓", "Price ↓ => Demand ↑", "Downward sloping demand curve"),
            examTip = "माँग की लोच (Price Elasticity of Demand, Ed = %ΔQ / %ΔP) का सूत्र भी तैयार रखें।"
        ),
        PyqQuestion(
            id = "q_12_econ_2023_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_econ",
            chapterId = "c12_econ_ch4",
            chapterName = "Money and Banking",
            year = 2023,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "व्यापारिक बैंकों (Commercial Banks) द्वारा साख निर्माण (Credit Creation) की प्रक्रिया को एक उदाहरण और तालिका की सहायता से समझाइए। साख गुणक क्या है?",
            questionEnglish = "Explain the process of credit creation by commercial banks with the help of a suitable example and table. What is credit multiplier?",
            answerHindi = "साख निर्माण (Credit Creation):\nव्यापारिक बैंक अपनी प्राथमिक जमाओं (Primary Deposits) के आधार पर कई गुना अधिक ऋण देते हैं, जिसे साख निर्माण कहते हैं।\n\nसाख गुणक (Money Multiplier):\nसाख गुणक (k) = 1 / LRR (वैधानिक तरलता अनुपात)\n\nउदाहरण:\nमाना प्रारंभिक प्राथमिक जमा = ₹1,000\nवैधानिक तरलता अनुपात (LRR) = 20% (0.2)\nसाख गुणक k = 1 / 0.2 = 5\nकुल साख निर्माण = प्राथमिक जमा × k = ₹1,000 × 5 = ₹5,000\n\nप्रक्रिया (चरणबद्ध):\n1. बैंक में ₹1,000 जमा हुए। 20% (₹200) नकद कोष रखकर बैंक शेष ₹800 का ऋण देता है। ऋण नकद न देकर खाते में जमा होता है।\n2. वह ₹800 फिर किसी बैंक में जमा होता है। उसका 20% (₹160) रखकर ₹640 का नया ऋण दिया जाता है।\n3. यह प्रक्रिया तब तक चलती है जब तक कुल नकद कोष प्रारंभिक जमा (₹1,000) के बराबर न हो जाए।\nअतः ₹1,000 से कुल ₹5,000 की नई जमा राशि उत्पन्न होती है।",
            answerEnglish = "Commercial banks create credit from primary deposits by making loans that return to the banking system as derivative deposits.\n\nMoney / Credit Multiplier (k) = 1 / LRR (Legal Reserve Ratio)\n\nExample:\nPrimary Deposit = ₹1,000\nLRR = 20% (0.2)\nMultiplier k = 1 / 0.2 = 5\nTotal Credit Created = Primary Deposit × k = 1,000 × 5 = ₹5,000.\n\nProcess:\n- Round 1: Deposit ₹1,000. Reserve = ₹200. Loan disbursed = ₹800.\n- Round 2: Deposit ₹800. Reserve = ₹160. Loan disbursed = ₹640.\n- Continued until total reserves equal initial deposit ₹1,000, creating ₹5,000 total money supply.",
            solutionSteps = listOf(
                "साख निर्माण की परिभाषा और सूत्र k = 1 / LRR लिखें।",
                "मानक उदाहरण (₹1,000 और 20% LRR) लें।",
                "तालिका बनाकर चरण 1, 2 एवं अंतिम कुल राशि दर्शाएं।",
                "कुल साख = ₹5,000 स्पष्ट रूप से निष्कर्ष दें।"
            ),
            keyFormulasOrPoints = listOf("Credit Multiplier k = 1 / LRR", "Total Deposits = Primary Deposit × (1 / LRR)"),
            examTip = "JAC 12वीं बोर्ड में यह 5 अंक का अत्यंत महत्वपूर्ण प्रश्न है। तालिका अवश्य बनाएं।"
        ),

        // ==================== CLASS 12 COMPUTER SCIENCE (SCIENCE STREAM) ====================
        PyqQuestion(
            id = "q_12_cs_2024_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_cs",
            chapterId = "c12_cs_ch1",
            chapterName = "OOPs Concepts & C++",
            year = 2024,
            questionNo = 1,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "C++ में किसी मौजूदा क्लास (Base Class) से नई क्लास (Derived Class) के गुणों को प्राप्त करने की क्षमता को क्या कहते हैं?",
            questionEnglish = "The mechanism of deriving a new class from an existing base class in C++ is known as:",
            options = listOf("Polymorphism (बहुरूपता)", "Inheritance (विरासत/उत्तराधिकार)", "Encapsulation (कैप्सूलीकरण)", "Data Hiding"),
            correctOptionIndex = 1,
            answerHindi = "सही उत्तर: (B) Inheritance (इनहेरिटेंस / उत्तराधिकार)\nइनहेरिटेंस ऑब्जेक्ट ओरिएंटेड प्रोग्रामिंग (OOPs) की वह विशेषता है जिसके द्वारा एक नई क्लास (Derived class) किसी पहले से बनी क्लास (Base class) के गुणों और विधियों को पुनः उपयोग (Reusability) कर सकती है।",
            answerEnglish = "Correct Answer: (B) Inheritance\nInheritance is the capability of a class to derive properties and characteristics from another base class. It promotes code reusability and hierarchical classification.",
            solutionSteps = listOf(
                "OOPs के 4 मुख्य स्तंभ: Encapsulation, Abstraction, Inheritance, Polymorphism.",
                "कोड की पुनः प्रयोज्यता (Reusability) = Inheritance.",
                "Syntax in C++: class Derived : access_specifier Base { ... };"
            ),
            keyFormulasOrPoints = listOf("Inheritance types: Single, Multiple, Multilevel, Hierarchical, Hybrid", "Base Class -> Derived Class"),
            examTip = "JAC कंप्यूटर साइंस परीक्षा में इनहेरिटेंस के प्रकारों (Single vs Multiple) पर 3 अंक का प्रश्न भी आता है।"
        ),
        PyqQuestion(
            id = "q_12_cs_2024_02",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_cs",
            chapterId = "c12_cs_ch2",
            chapterName = "Data Structures (Stack & Queue)",
            year = 2024,
            questionNo = 8,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "स्टैक (Stack) क्या है? स्टैक के दो बुनियादी ऑपरेशन्स (PUSH और POP) को समझाइए। यह किस सिद्धांत पर कार्य करता है?",
            questionEnglish = "What is a Stack? Explain its two basic operations (PUSH and POP). On which principle does it work?",
            answerHindi = "स्टैक (Stack):\nस्टैक एक रैखिक डेटा संरचना (Linear Data Structure) है जो LIFO (Last In First Out) सिद्धांत पर कार्य करता है। अर्थात जो तत्व सबसे अंत में डाला जाता है, वह सबसे पहले बाहर निकलता है। इसमें सभी प्रविष्टियाँ और विलोपन केवल एक सिरे से होते हैं जिसे 'Top' कहते हैं।\n\nदो बुनियादी ऑपरेशन्स:\n1. PUSH ऑपरेशन:\nस्टैक के शीर्ष (Top) पर एक नया तत्व डालने (Insert) की प्रक्रिया को PUSH कहते हैं। यदि स्टैक पहले से भरा हुआ हो, तो 'Overflow' की स्थिति उत्पन्न होती है।\n\n2. POP ऑपरेशन:\nस्टैक के शीर्ष (Top) से वर्तमान तत्व को हटाने (Delete) की प्रक्रिया को POP कहते हैं। यदि स्टैक पहले से खाली हो, तो 'Underflow' की स्थिति उत्पन्न होती है।",
            answerEnglish = "Stack:\nA Stack is a linear data structure that follows the LIFO (Last In First Out) principle, meaning the last element added is the first one to be removed. All insertions and deletions take place at a single end called 'Top'.\n\nBasic Operations:\n1. PUSH: The operation of inserting a new element at the Top of the stack. If the stack is full, it causes 'Stack Overflow'.\n2. POP: The operation of deleting the top element from the stack. If the stack is empty, it causes 'Stack Underflow'.",
            solutionSteps = listOf(
                "LIFO (Last In First Out) सिद्धांत स्पष्ट करें।",
                "PUSH = Insert at TOP (Overflow check: Top == MAX-1)।",
                "POP = Delete from TOP (Underflow check: Top == -1)।",
                "स्टैक का आरेख बनाएं।"
            ),
            keyFormulasOrPoints = listOf("LIFO principle", "PUSH: Top = Top + 1", "POP: Top = Top - 1", "Overflow & Underflow"),
            examTip = "JAC 12वीं में PUSH और POP का C++ फंक्शन या एल्गोरिदम लिखने के लिए 3 से 5 अंकों में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_12_cs_2024_03",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_cs",
            chapterId = "c12_cs_ch3",
            chapterName = "Database Management System & SQL",
            year = 2024,
            questionNo = 14,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "प्राइमरी कुंजी (Primary Key) और फॉरेन कुंजी (Foreign Key) में क्या अंतर है? निम्नलिखित SQL प्रश्नों के लिए क्वेरी (Query) लिखिए:\n(i) STUDENT टेबल से सभी रिकॉर्ड्स दिखाएँ जहाँ MARKS 80 से अधिक हों।\n(ii) STUDENT टेबल में रोल नंबर 101 के MARKS को 95 में अपडेट करें।",
            questionEnglish = "Differentiate between Primary Key and Foreign Key. Write SQL queries for the following:\n(i) Display all records from STUDENT table where MARKS > 80.\n(ii) Update MARKS to 95 for RollNo 101 in STUDENT table.",
            answerHindi = "1. प्राइमरी कुंजी (Primary Key):\nयह टेबल के प्रत्येक रिकॉर्ड (Tuple) को विशिष्ट (Uniquely) रूप से पहचानती है। इसमें कोई भी मान NULL या दोहराव (Duplicate) वाला नहीं हो सकता। एक टेबल में केवल एक ही प्राइमरी की होती है।\n\n2. फॉरेन कुंजी (Foreign Key):\nयह एक टेबल का ऐसा फील्ड या कॉलम होता है जो दूसरी टेबल की प्राइमरी कुंजी को संदर्भित (Reference) करता है। इसका उपयोग दो तालिकाओं के बीच संबंध (Relationship) स्थापित करने के लिए किया जाता है। इसमें NULL मान हो सकते हैं।\n\nSQL क्वेरीज़:\n(i) 80 से अधिक मार्क्स वाले छात्र दिखाने के लिए:\nSELECT * FROM STUDENT WHERE MARKS > 80;\n\n(ii) रोल नंबर 101 के मार्क्स अपडेट करने के लिए:\nUPDATE STUDENT SET MARKS = 95 WHERE RollNo = 101;",
            answerEnglish = "1. Primary Key: A column or set of columns that uniquely identifies each row in a table. It cannot contain NULL values and must be unique. A table can have only one Primary Key.\n2. Foreign Key: A column in one table that references the Primary Key of another table, establishing a link between the two tables. It can accept duplicate and NULL values.\n\nSQL Queries:\n(i) SELECT * FROM STUDENT WHERE MARKS > 80;\n(ii) UPDATE STUDENT SET MARKS = 95 WHERE RollNo = 101;",
            solutionSteps = listOf(
                "Primary Key की विशेषताएं: Unique + NOT NULL।",
                "Foreign Key की विशेषताएं: Referential integrity across tables।",
                "SELECT क्वेरी में WHERE क्लॉज का उपयोग।",
                "UPDATE क्वेरी में SET और WHERE क्लॉज का सटीक सिंटैक्स।"
            ),
            keyFormulasOrPoints = listOf("Primary Key: Unique & NOT NULL", "Foreign Key: Establishes relationship", "UPDATE table SET col = val WHERE condition;"),
            examTip = "SQL प्रश्नों में सेमीकोलन (;) लगाना न भूलें। DDL और DML कमांड्स में अंतर भी तैयार रखें।"
        ),
        PyqQuestion(
            id = "q_12_cs_2023_01",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_cs",
            chapterId = "c12_cs_ch4",
            chapterName = "Boolean Algebra & Logic Gates",
            year = 2023,
            questionNo = 9,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "बूलियन बीजगणित में डी-मॉर्गन के नियमों (De Morgan's Laws) का कथन लिखिए और सत्यता सारणी (Truth Table) की सहायता से प्रथम नियम सिद्ध कीजिए।",
            questionEnglish = "State De Morgan's Laws in Boolean Algebra and prove the first law using a Truth Table.",
            answerHindi = "डी-मॉर्गन के दो नियम:\n1. प्रथम नियम: (A + B)' = A' . B'\n(योग का पूरक व्यक्तिगत पूरकों के गुणनफल के बराबर होता है)\n\n2. द्वितीय नियम: (A . B)' = A' + B'\n(गुणनफल का पूरक व्यक्तिगत पूरकों के योग के बराबर होता है)\n\nप्रथम नियम (A + B)' = A' . B' का सत्यापन (सत्यता सारणी):\n[A] [B] | [A+B] | [(A+B)'] | [A'] [B'] | [A'.B']\n 0   0  |   0   |    1     |  1    1   |   1\n 0   1  |   1   |    0     |  1    0   |   0\n 1   0  |   1   |    0     |  0    1   |   0\n 1   1  |   1   |    0     |  0    0   |   0\n\nस्तंभ 4 [(A+B)'] और स्तंभ 6 [A'.B'] के सभी मान सर्वसम (Identical) हैं।\nअतः (A + B)' = A' . B' सिद्ध हुआ।",
            answerEnglish = "De Morgan's Laws:\n1. First Law: (A + B)' = A' . B'\n(The complement of a sum equals the product of individual complements)\n2. Second Law: (A . B)' = A' + B'\n(The complement of a product equals the sum of individual complements)\n\nProof of First Law using Truth Table:\nA  B | A+B | (A+B)' | A' B' | A'.B'\n0  0 |  0  |   1    | 1  1  |   1\n0  1 |  1  |   0    | 1  0  |   0\n1  0 |  1  |   0    | 0  1  |   0\n1  1 |  1  |   0    | 0  0  |   0\nColumns (A+B)' and A'.B' are identical. Hence proved.",
            solutionSteps = listOf(
                "दोनों नियमों के सूत्र लिखें।",
                "A और B के चार संभव संयोजन (00, 01, 10, 11) बनाएं।",
                "A+B और उसका पूरक निकालें।",
                "A' और B' निकालकर उनका गुणन (AND) करें और दोनों स्तंभ समान दिखाएं।"
            ),
            keyFormulasOrPoints = listOf("(A + B)' = A' · B'", "(A · B)' = A' + B'"),
            examTip = "JAC कंप्यूटर साइंस में डी-मॉर्गन का नियम अथवा K-Map सरलीकरण 3 अंकों में हर वर्ष पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_12_cs_2023_02",
            classType = PyqClass.CLASS_12,
            subjectId = "c12_cs",
            chapterId = "c12_cs_ch5",
            chapterName = "Computer Networks & Security",
            year = 2023,
            questionNo = 15,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "नेटवर्क टोपोलॉजी क्या है? स्टार टोपोलॉजी (Star Topology) और बस टोपोलॉजी (Bus Topology) की कार्यप्रणाली को आरेख बनाकर समझाइए। प्रत्येक का एक-एक लाभ और हानि भी लिखिए।",
            questionEnglish = "What is Network Topology? Explain Star Topology and Bus Topology with diagrams. Mention one advantage and one disadvantage of each.",
            answerHindi = "नेटवर्क टोपोलॉजी:\nकंप्यूटर नेटवर्क में विभिन्न नोड्स (कंप्यूटर या उपकरण) और उनके बीच संचार लिंक की ज्यामितीय व्यवस्था (Geometrical arrangement) को टोपोलॉजी कहते हैं।\n\n1. स्टार टोपोलॉजी (Star Topology):\n- इसमें सभी नोड्स एक केंद्रीय हब (Hub) या स्विच (Switch) से अलग-अलग केबल द्वारा सीधे जुड़े होते हैं।\n- लाभ: किसी एक कंप्यूटर या केबल के खराब होने पर पूरा नेटवर्क बाधित नहीं होता।\n- हानि: यदि केंद्रीय हब/स्विच खराब हो जाए, तो पूरा नेटवर्क ठप हो जाता है।\n\n2. बस टोपोलॉजी (Bus Topology):\n- इसमें सभी नोड्स एक ही मुख्य संचार लाइन (Backbone cable / Bus) से जुड़े होते हैं जिसके दोनों सिरों पर टर्मिनेटर (Terminator) लगे होते हैं।\n- लाभ: कम केबल की आवश्यकता होती है और इसे स्थापित करना सस्ता व सरल है।\n- हानि: यदि मुख्य बैकबोन केबल टूट जाए, तो पूरा नेटवर्क बंद हो जाता है।",
            answerEnglish = "Network Topology is the geometric arrangement of nodes (computers) and connecting lines in a network.\n\n1. Star Topology:\n- All nodes are connected to a central device (Hub/Switch).\n- Advantage: Fault tolerance—failure of one cable/node does not affect others.\n- Disadvantage: Central point of failure—if the hub fails, the whole network goes down.\n\n2. Bus Topology:\n- All nodes share a single central backbone cable terminated at both ends.\n- Advantage: Easy to install and requires minimal cabling (cost-effective).\n- Disadvantage: If the backbone cable breaks, the entire network fails.",
            solutionSteps = listOf(
                "टोपोलॉजी की परिभाषा लिखें।",
                "स्टार टोपोलॉजी: सेंट्रल हब + रेडियल कनेक्शन + लाभ/हानि।",
                "बस टोपोलॉजी: सिंगल बैकबोन केबल + टर्मिनेटर + लाभ/हानि।"
            ),
            keyFormulasOrPoints = listOf("Star: Central Hub/Switch", "Bus: Single Backbone cable", "Ring, Mesh, Tree"),
            examTip = "JAC बोर्ड में स्टार और बस टोपोलॉजी का तुलनात्मक प्रश्न अक्सर पूछा जाता है।"
        ),

        // ==================== CLASS 10 ENGLISH (FIRST FLIGHT & FOOTPRINTS - OLD NCERT) ====================
        PyqQuestion(
            id = "q_10_eng_ff_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_first_flight",
            chapterId = "c10_eng_ff_ch1",
            chapterName = "भगवान के नाम एक पत्र (A Letter to God)",
            year = 2024,
            questionNo = 1,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "लेंचो ने ईश्वर से कितने पेसो (pesos) की मांग की थी और डाकपाल की सहायता से उसे कितने पेसो मिले?",
            questionEnglish = "How much money did Lencho demand from God and how much did he actually receive?",
            options = listOf(
                "Demanded 100 pesos, received 70 pesos (100 मांगे, 70 मिले)",
                "Demanded 100 pesos, received 50 pesos (100 मांगे, 50 मिले)",
                "Demanded 50 pesos, received 70 pesos (50 मांगे, 70 मिले)",
                "Demanded 70 pesos, received 100 pesos (70 मांगे, 100 मिले)"
            ),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) Demanded 100 pesos, received 70 pesos\nलेंचो ने अपनी नष्ट हुई मक्के की फसल के नुकसान की भरपाई के लिए ईश्वर से 100 पेसो मांगे थे। पोस्टमास्टर और कर्मचारियों ने मिलकर 70 पेसो इकट्ठा कर लिफाफे में 'God' हस्ताक्षर करके भेजे।",
            answerEnglish = "Correct Answer: (A) Demanded 100 pesos, received 70 pesos\nLencho asked God for 100 pesos to sow his field again and live until the next crop. The kind postmaster managed to collect and send only 70 pesos with the signature 'God'.",
            solutionSteps = listOf(
                "लेंचो की मक्के की फसल भयंकर ओलावृष्टि (hailstorm) से नष्ट हो गई थी।",
                "उसने 100 पेसो की मांग की थी।",
                "उसे 70 पेसो प्राप्त हुए जिसे देखकर उसने डाक कर्मचारियों को 'बंच ऑफ क्रुक्स' (a bunch of crooks) कहा।"
            ),
            keyFormulasOrPoints = listOf("Lencho: 100 pesos requested", "Received: 70 pesos", "Irony: Post office employees called bunch of crooks"),
            examTip = "JAC बोर्ड में 'A Letter to God' से 100 पेसो और 70 पेसो तथा आयरनी (irony) पर बार-बार प्रश्न पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_eng_ff_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_first_flight",
            chapterId = "c10_eng_ff_ch1",
            chapterName = "भगवान के नाम एक पत्र (A Letter to God)",
            year = 2024,
            questionNo = 12,
            marks = 2,
            type = QuestionType.SHORT,
            questionHindi = "लेंचो ने वर्षा की बूंदों की तुलना 'नए सिक्के' (new coins) से क्यों की?",
            questionEnglish = "Why did Lencho compare the raindrops to 'new coins'?",
            answerHindi = "लेंचो ने वर्षा की बूंदों की तुलना नए सिक्कों से इसलिए की क्योंकि उसकी पकी हुई मक्के की फसल को एक अच्छी बारिश या बौछार की सख्त आवश्यकता थी। अच्छी वर्षा का अर्थ था भरपूर पैदावार और फसल बेचकर अच्छा धन लाभ। इसलिए बड़ी बूंदें 10 सेंट के सिक्कों के समान और छोटी बूंदें 5 सेंट के सिक्कों के समान थीं।",
            answerEnglish = "Lencho compared the raindrops to new coins because his ripe corn fields desperately needed a downpour. A good rain promised a rich harvest, which would bring prosperity and money to his family. Hence, big drops were like ten-cent pieces and little ones like five-cent pieces.",
            solutionSteps = listOf(
                "फसल को अच्छी वर्षा की जरूरत थी।",
                "अच्छी बारिश = उत्तम फसल पैदावार = अधिक धन (coins)।",
                "बड़ी बूंदें = 10 सेंट, छोटी बूंदें = 5 सेंट।"
            ),
            keyFormulasOrPoints = listOf("Raindrops = New coins", "Big drops = 10 cents", "Little drops = 5 cents"),
            examTip = "10 सेंट और 5 सेंट का विवरण उत्तर में अवश्य शामिल करें, इससे पूरे अंक मिलते हैं।"
        ),
        PyqQuestion(
            id = "q_10_eng_ff_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_first_flight",
            chapterId = "c10_eng_ff_ch2",
            chapterName = "नेल्सन मंडेला: स्वतंत्रता की लंबी यात्रा (Nelson Mandela)",
            year = 2023,
            questionNo = 14,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "नेल्सन मंडेला के अनुसार 'साहस' (Courage) का क्या अर्थ है और उन्होंने देश की सबसे बड़ी संपत्ति किसे माना?",
            questionEnglish = "What did 'courage' mean to Nelson Mandela and what is the greatest wealth of a nation according to him?",
            answerHindi = "मंडेला के अनुसार साहस का अर्थ भय की अनुपस्थिति (absence of fear) नहीं, बल्कि भय पर विजय (triumph over fear) प्राप्त करना है। साहसी व्यक्ति वह नहीं है जिसे डर नहीं लगता, बल्कि वह है जो डर को जीत लेता है।\nइसके अतिरिक्त मंडेला के अनुसार किसी देश की सबसे बड़ी और सच्ची संपत्ति उसके लोग (its people) हैं, जो सबसे शुद्ध हीरों (purest diamonds) से भी अधिक सच्चे और मूल्यवान हैं।",
            answerEnglish = "According to Nelson Mandela, courage is not the absence of fear, but the triumph over it. The brave man is not he who does not feel afraid, but he who conquers that fear.\nFurthermore, he believed that the greatest wealth of his country is its people, who are finer and truer than the purest diamonds.",
            solutionSteps = listOf(
                "साहस की परिभाषा: भय पर विजय (Triumph over fear, not absence of fear)।",
                "देश की असली संपत्ति: उसके नागरिक (People are finer than diamonds)।"
            ),
            keyFormulasOrPoints = listOf("Courage = Triumph over fear", "Greatest wealth = People (finer than diamonds)"),
            examTip = "JAC बोर्ड परीक्षा में मंडेला के दोनों विचारों (Courage और Wealth of a nation) को 3 अंक के प्रश्न में पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_eng_fp_2024_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_footprints",
            chapterId = "c10_eng_fp_ch1",
            chapterName = "सर्जरी की विजय (A Triumph of Surgery)",
            year = 2024,
            questionNo = 2,
            marks = 1,
            type = QuestionType.MCQ,
            questionHindi = "डॉ. जेम्स हेरियट के अनुसार छोटे कुत्ते ट्रिकी (Tricki) की बीमारी का एकमात्र कारण क्या था?",
            questionEnglish = "What was Tricki's only fault according to Dr. James Herriot?",
            options = listOf(
                "Greed for food (भोजन का लालच)",
                "Lack of medicine (दवा की कमी)",
                "Hostile nature (आक्रामक स्वभाव)",
                "Infection (संक्रमण)"
            ),
            correctOptionIndex = 0,
            answerHindi = "सही उत्तर: (A) Greed for food (भोजन का लालच)\nट्रिकी का एकमात्र दोष उसका भोजन के प्रति अत्यधिक लालच था। वह किसी भी समय खाना खाने से मना नहीं करता था और मिसेज पम्फ्री उसे आवश्यकता से अधिक पोषण (क्रीम केक, चॉकलेट, कॉड-लिवर तेल, हॉर्लिक्स) देती थीं।",
            answerEnglish = "Correct Answer: (A) Greed for food\nTricki's only fault was greed. He had never been known to refuse food and would tackle a meal at any hour of the day or night, leading to severe obesity and illness.",
            solutionSteps = listOf(
                "मिसेज पम्फ्री द्वारा अत्यधिक लाड़-प्यार और अति-पोषण।",
                "ट्रिकी का लालच (Greed for food) और व्यायाम का अभाव।",
                "डॉ. हेरियट ने बिना दवा सिर्फ पानी और अन्य कुत्तों के साथ व्यायाम देकर उसे ठीक किया।"
            ),
            keyFormulasOrPoints = listOf("Tricki's fault = Greed for food", "Owner = Mrs. Pumphrey", "Vet Surgeon = Dr. James Herriot"),
            examTip = "यह 1 अंक का बहुविकल्पीय प्रश्न बोर्ड परीक्षा में प्रायः पूछा जाता है।"
        ),
        PyqQuestion(
            id = "q_10_eng_fp_2024_02",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_footprints",
            chapterId = "c10_eng_fp_ch2",
            chapterName = "चोर की कहानी (The Thief's Story)",
            year = 2024,
            questionNo = 16,
            marks = 3,
            type = QuestionType.SHORT,
            questionHindi = "हरी सिंह ने अनिल के 600 रुपये चुराने और स्टेशन पहुँचने के बाद भी ट्रेन में न चढ़कर वापस लौटने का निर्णय क्यों लिया?",
            questionEnglish = "Why did Hari Singh not board the train after stealing Anil's money and decide to return to him?",
            answerHindi = "हरी सिंह ने अनिल के गद्दे के नीचे से 600 रुपये चुरा लिए थे और वह लखनऊ एक्सप्रेस पकड़ने स्टेशन पहुँच गया था। परंतु उसकी अंतरात्मा ने उसे रोका। उसने महसूस किया कि:\n1. अनिल एक सीधा-साधा, दयालु और विश्वासपात्र व्यक्ति था, चोरी का पता चलने पर उसे पैसों का नहीं, बल्कि विश्वास टूटने का दुख होगा।\n2. अनिल उसे पढ़ना-लिखना और पूरे वाक्य बनाना सिखा रहा था। हरी सिंह समझ गया कि चोरी से वह केवल कुछ दिन अमीर रह सकता है, परंतु शिक्षा पाकर वह एक सम्मानित और सच्चा इंसान बन सकता है।",
            answerEnglish = "Hari Singh did not board the train because his conscience pricked him. He realized that:\n1. Anil was simple, kind, and trusting; he would be hurt not by the loss of money, but by the breach of trust.\n2. Anil was teaching him how to read, write, and add numbers. Education would give him respect, status, and honest success far greater than a petty thief's life.",
            solutionSteps = listOf(
                "स्टेशन पर अंतरात्मा की पुकार (voice of conscience)।",
                "अनिल के विश्वास की कद्र (loss of trust vs loss of money)।",
                "शिक्षा की शक्ति: पढ़ना-लिखना सीखकर एक सच्चा व सम्मानित नागरिक बनना।"
            ),
            keyFormulasOrPoints = listOf("Stolen amount: Rs. 600 (50-rupee notes)", "Train: Lucknow Express", "Key theme: Transformation through trust and education"),
            examTip = "हरी सिंह के चरित्र परिवर्तन (character transformation) में शिक्षा और अनिल के विश्वास की भूमिका स्पष्ट लिखें।"
        ),
        PyqQuestion(
            id = "q_10_eng_fp_2023_01",
            classType = PyqClass.CLASS_10,
            subjectId = "c10_eng_footprints",
            chapterId = "c10_eng_fp_ch9",
            chapterName = "भोली (Bholi)",
            year = 2023,
            questionNo = 18,
            marks = 5,
            type = QuestionType.LONG,
            questionHindi = "भोली ने लालची बिशंबरनाथ से शादी करने से क्यों इनकार कर दिया? भोली के चरित्र से हमें क्या सीख मिलती है?",
            questionEnglish = "Why did Bholi refuse to marry the greedy Bishamber? What lesson do we learn from Bholi's character?",
            answerHindi = "भोली (सुलेखा) ने बिशंबरनाथ से विवाह करने से इसलिए इनकार कर दिया क्योंकि:\n1. बिशंबरनाथ एक बूढ़ा, लंगड़ा और लालची दुकानदार था जिसने भोली के चेहरे पर चेचक के दाग देखकर शादी करने के लिए उसके लाचार पिता रामलाल से 5,000 रुपये दहेज की मांग की और पगड़ी पैरों में रखवा दी।\n2. भोली अपने पिता के सम्मान की खातिर एक बूढ़े व्यक्ति से शादी करने को तैयार थी, परंतु जब उसने बिशंबर का लालची और नीच रूप देखा तो उसने वरमाला आग में फेंक दी और स्पष्ट स्वर में शादी से मना कर दिया।\n\nसीख:\nशिक्षा ने भोली को एक गूंगी गाय से एक आत्मविश्वासी, निर्भीक और स्वाभिमानी महिला बना दिया। यह कहानी सिखाती है कि नारी को दहेज और अन्याय के आगे कभी नहीं झुकना चाहिए और शिक्षा ही महिलाओं के सशक्तिकरण का सबसे बड़ा माध्यम है।",
            answerEnglish = "Bholi refused to marry Bishamber because:\n1. Bishamber was an old, lame, and greedy man who demanded Rs. 5,000 in dowry upon seeing smallpox marks on Bholi's face, thereby humiliating her father Ramlal.\n2. Bholi was willing to sacrifice her happiness for her father's sake, but she refused to accept a mean, greedy, and cowardly man as her husband.\n\nLesson:\nEducation transformed a timid, stammering girl into a confident and dignified woman. The story teaches that women should stand up against social evils like dowry and discrimination.",
            solutionSteps = listOf(
                "बिशंबर की लालची प्रकृति और 5000 रुपये की दहेज मांग।",
                "रामलाल का अपमान और भोली का वरमाला फेंककर निर्भीक विरोध।",
                "शिक्षिका का स्नेह और शिक्षा का जादुई प्रभाव (आत्मविश्वास व स्वाभिमान)।"
            ),
            keyFormulasOrPoints = listOf("Bholi's real name: Sulekha", "Groom: Bishamber Nath (demanded Rs 5000)", "Theme: Girl child education & anti-dowry"),
            examTip = "5 अंक के प्रश्न में भोली के पूर्व रूप ('गूंगी गाय') और अंतिम रूप ('आत्मविश्वासी नारी') का तुलनात्मक विवरण जरूर लिखें।"
        )
    )

    val sstBooks: List<SstBook> = listOf(
        SstBook(
            id = "c10_sst_hist",
            subjectId = "c10_sst_hist",
            name = "History",
            hindiName = "इतिहास",
            bookTitleHindi = "भारत और समकालीन विश्व - II",
            iconName = "menu_book",
            chaptersCount = 5,
            colorHex = 0xFF991B1B,
            description = "यूरोप में राष्ट्रवाद, भारत में राष्ट्रवाद, भूमंडलीकृत विश्व, औद्योगिकीकरण, मुद्रण संस्कृति।"
        ),
        SstBook(
            id = "c10_sst_geo",
            subjectId = "c10_sst_geo",
            name = "Geography",
            hindiName = "भूगोल",
            bookTitleHindi = "समकालीन भारत - II",
            iconName = "public",
            chaptersCount = 7,
            colorHex = 0xFF047857,
            description = "संसाधन एवं विकास, वन एवं वन्यजीव, जल संसाधन, कृषि, खनिज व ऊर्जा, विनिर्माण उद्योग, अर्थव्यवस्था की जीवन रेखाएँ।"
        ),
        SstBook(
            id = "c10_sst_civ",
            subjectId = "c10_sst_civ",
            name = "Civics",
            hindiName = "नागरिक शास्त्र",
            bookTitleHindi = "लोकतांत्रिक राजनीति - II",
            iconName = "account_balance",
            chaptersCount = 8,
            colorHex = 0xFF4338CA,
            description = "सत्ता की साझेदारी, संघवाद, लोकतंत्र और विविधता, जाति धर्म व लैंगिक मसले, राजनीतिक दल, लोकतंत्र के परिणाम।"
        ),
        SstBook(
            id = "c10_sst_eco",
            subjectId = "c10_sst_eco",
            name = "Economics",
            hindiName = "अर्थशास्त्र",
            bookTitleHindi = "आर्थिक विकास की समझ",
            iconName = "trending_up",
            chaptersCount = 5,
            colorHex = 0xFF0E7490,
            description = "विकास, भारतीय अर्थव्यवस्था के क्षेत्रक, मुद्रा और साख, वैश्वीकरण, उपभोक्ता अधिकार।"
        )
    )

    val hindiBooks: List<HindiBook> = listOf(
        HindiBook(
            id = "c10_hin_kshitij",
            subjectId = "c10_hin_kshitij",
            name = "क्षितिज भाग - 2",
            hindiName = "क्षितिज भाग - 2",
            bookTitleHindi = "काव्य खंड एवं गद्य खंड (Old NCERT - 17 अध्याय)",
            iconName = "auto_stories",
            chaptersCount = 17,
            colorHex = 0xFFD97706,
            description = "सूरदास (पद), तुलसीदास (राम-लक्ष्मण-परशुराम संवाद), देव, जयशंकर प्रसाद, निराला, नागार्जुन, गिरिजाकुमार माथुर, ऋतुराज, मंगलेश डबराल, स्वयं प्रकाश (नेताजी का चश्मा), रामवृक्ष बेनीपुरी (बालगोबिन भगत), यशपाल, सर्वेश्वर दयाल सक्सेना, मन्नू भंडारी, महावीर प्रसाद द्विवेदी, यतीन्द्र मिश्र, भदंत आनंद कौसल्यायन।"
        ),
        HindiBook(
            id = "c10_hin_kritika",
            subjectId = "c10_hin_kritika",
            name = "कृतिका भाग - 2",
            hindiName = "कृतिका भाग - 2",
            bookTitleHindi = "पूरक पाठ्यपुस्तक (Old NCERT - 5 अध्याय)",
            iconName = "menu_book",
            chaptersCount = 5,
            colorHex = 0xFFB45309,
            description = "माता का अँचल (शिवपूजन सहाय), जॉर्ज पंचम की नाक (कमलेश्वर), साना-साना हाथ जोड़ि... (मधु कांकरिया), एही ठैयाँ झुलनी हेरानी हो रामा! (शिवप्रसाद मिश्र 'रुद्र'), मैं क्यों लिखता हूँ? (अज्ञेय)।"
        )
    )

    val englishBooks: List<EnglishBook> = listOf(
        EnglishBook(
            id = "c10_eng_first_flight",
            subjectId = "c10_eng_first_flight",
            name = "First Flight",
            hindiName = "फर्स्ट फ्लाइट",
            bookTitleHindi = "मुख्य पाठ्यपुस्तक (Old NCERT - 11 अध्याय)",
            iconName = "auto_stories",
            chaptersCount = 11,
            colorHex = 0xFF2563EB,
            description = "भगवान के नाम एक पत्र, नेल्सन मंडेला, उड़ान के बारे में दो कहानियाँ, ऐनी फ्रैंक की डायरी, सौ पोशाकें (I व II), भारत की झलकियाँ, मिजबिल, मैडम बस की सवारी, बनारस में उपदेश, विवाह का प्रस्ताव।"
        ),
        EnglishBook(
            id = "c10_eng_footprints",
            subjectId = "c10_eng_footprints",
            name = "Footprints Without Feet",
            hindiName = "फुटप्रिंट्स विदाउट फीट",
            bookTitleHindi = "पूरक पाठ्यपुस्तक (Old NCERT - 10 अध्याय)",
            iconName = "menu_book",
            chaptersCount = 10,
            colorHex = 0xFF4F46E5,
            description = "सर्जरी की विजय, चोर की कहानी, आधी रात का आगंतुक, विश्वास का प्रश्न, बिना पैरों के पदचिह्न, एक वैज्ञानिक का निर्माण, हार, गाड़ीवान, भोली, वह पुस्तक जिसने पृथ्वी को बचाया।"
        )
    )

    fun getSubjectsForClass(classType: PyqClass, stream: Stream = Stream.ALL): List<Subject> {
        return subjects.filter { it.classType == classType && !it.isSubSubject }
    }

    fun getSubjectById(subjectId: String): Subject? {
        return subjects.find { it.id == subjectId }
    }

    fun getChaptersForSubject(subjectId: String): List<Chapter> {
        return chapters.filter { it.subjectId == subjectId }
    }

    fun getChapterById(chapterId: String): Chapter? {
        return chapters.find { it.id == chapterId }
    }

    fun getYearsForSubject(subjectId: String): List<ExamYear> {
        return yearsList
    }

    fun getQuestions(
        classType: PyqClass,
        subjectId: String,
        chapterId: String? = null,
        year: Int? = null,
        type: QuestionType? = null
    ): List<PyqQuestion> {
        return questions.filter { q ->
            q.classType == classType &&
                    (q.subjectId == subjectId ||
                            (subjectId == "c10_sst" && q.subjectId.startsWith("c10_sst_")) ||
                            (subjectId == "c10_hin" && q.subjectId.startsWith("c10_hin_")) ||
                            (subjectId == "c10_eng" && q.subjectId.startsWith("c10_eng_"))) &&
                    (chapterId == null || q.chapterId == chapterId) &&
                    (year == null || q.year == year) &&
                    (type == null || q.type == type)
        }
    }

    fun searchQuestions(query: String): List<PyqQuestion> {
        if (query.isBlank()) return emptyList()
        val lower = query.trim().lowercase()
        return questions.filter { q ->
            q.questionHindi.lowercase().contains(lower) ||
                    q.questionEnglish.lowercase().contains(lower) ||
                    q.chapterName.lowercase().contains(lower) ||
                    q.answerHindi.lowercase().contains(lower) ||
                    q.answerEnglish.lowercase().contains(lower)
        }
    }

    fun getQuestionById(questionId: String): PyqQuestion? {
        return questions.find { it.id == questionId }
    }
}
