load("//:junit5.bzl", "java_junit5_test")

java_library(
    name = "WordCounter",
    srcs = ["WordCounter.java"],
    deps = [
        "//sdk/src/main/java/com/augustbonds/foundation",
        "//sdk/src/main/java/com/augustbonds/mapreduce:mapreduce",
    ]
)

java_junit5_test(
    name = "MapReduceTest",
    size = "small",
    srcs = ["TestMapReduce.java"],
    test_class = "com.augustbonds.mapreduce.TestMapReduce",
    deps = [
        "//sdk/src/main/java/com/augustbonds/foundation",
        "@junit5_api//jar",
        "//sdk/src/main/java/com/augustbonds/mapreduce:mapreduce",
        ":WordCounter",
    ]
)