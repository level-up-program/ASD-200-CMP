import json
import csv

with open("github-dump.json") as json_file:
    data = []
    for line in json_file.readlines():
        data.append(json.loads(line))

data_file = open("github-dump.csv", "w")
csv_writer = csv.writer(data_file)

count = 0
for issue in data:

    if issue["title"] != "ACCESS REQUEST":
        continue

    issue["author"] = issue["author"]["login"]

    # Writing headers of CSV file
    if count == 0:
        header = issue.keys()
        csv_writer.writerow(header)
        count += 1

    # Writing data of CSV file
    csv_writer.writerow(issue.values())

data_file.close()
