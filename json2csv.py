# Python program to convert
# JSON file to CSV


import json
import csv


# Opening JSON file and loading the data
# into the variable data
with open('github-dump.json') as json_file:
    data = []
    for line in json_file.readlines():
	data.append(json.loads(line))

# now we will open a file for writing
data_file = open('github-dump.csv', 'w')

# create the csv writer object
csv_writer = csv.writer(data_file)

# Counter variable used for writing
# headers to the CSV file
count = 0

for issue in data:
	if count == 0:

		# Writing headers of CSV file
		header = issue.keys()
		csv_writer.writerow(header)
		count += 1

	# Writing data of CSV file
	csv_writer.writerow(issue.values())

data_file.close()

