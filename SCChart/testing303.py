import csv
from tkinter.filedialog import askopenfilename

def filter_csv(input_file, output_file):
    with open(input_file, 'r', newline='') as input_csv_file, \
            open(output_file, 'w', newline='') as output_csv_file:
        reader = csv.reader(input_csv_file)
        writer = csv.writer(output_csv_file)

        for row in reader:
            # Check if column A or column V contains zero (assuming 0-based indexing)
            if row and (row[1] == ' 0' and row[2] == ' 0'):
                continue  # Skip this row if column A or column V contains zero
            writer.writerow(row)


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    filename = askopenfilename() # show an "Open" dialog box and return the path to the selected file

    filter_csv(filename, "output.csv")