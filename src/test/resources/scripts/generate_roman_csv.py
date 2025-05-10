import csv
import roman # Needs to be installed via pip
from pathlib import Path

script_dir = Path(__file__).resolve().parent
parent_dir = script_dir.parent
output_file = parent_dir / "roman_numerals.csv"

def generate_roman_csv(start=1, end=1000, output_file=output_file):
    with open(output_file, mode="w", newline="") as file:
        writer = csv.writer(file)
        writer.writerow(["arabic", "roman"])
        for number in range(start, end + 1):
            roman_numeral = roman.toRoman(number)
            writer.writerow([number, roman_numeral])
    print(f"✅ CSV file written to {output_file}")

if __name__ == "__main__":
    generate_roman_csv()