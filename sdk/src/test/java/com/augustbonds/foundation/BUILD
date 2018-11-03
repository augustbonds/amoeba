load("//:junit5.bzl", "java_junit5_test")

java_library(
    name = "test_util",
    srcs = ["TestUtil.java"],
    deps = [
        "@junit5_api//jar",
    ]
)

java_junit5_test(
    name = "ArrayTest",
    size = "small",
    srcs = ["ArrayTest.java"],
    test_class = "com.augustbonds.foundation.ArrayTest",
    deps = [
        "//sdk/src/main/java/com/augustbonds/foundation",
        "@junit5_api//jar",
        ":test_util",
    ]
)

java_junit5_test(
    name = "DictionaryTest",
    size = "small",
    srcs = ["DictionaryTest.java"],
    test_class = "com.augustbonds.foundation.DictionaryTest",
    deps = [
        "//sdk/src/main/java/com/augustbonds/foundation",
        "@junit5_api//jar",
        ":test_util",
    ]
)

java_junit5_test(
    name = "SetTest",
    size = "small",
    srcs = ["SetTest.java"],
    test_class = "com.augustbonds.foundation.SetTest",
    deps = [
        "//sdk/src/main/java/com/augustbonds/foundation",
        "@junit5_api//jar",
        ":test_util",
    ]
)