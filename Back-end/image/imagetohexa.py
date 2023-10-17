import os

def image_to_hex(chemin_image):
    try:
        # Ouvrir le fichier image en mode binaire
        with open(chemin_image, 'rb') as fichier_image:
            # Lire le contenu du fichier en tant que données binaires
            donnees_image = fichier_image.read()
            
            # Convertir les données binaires en hexadécimal
            valeur_hexadecimale = donnees_image.hex()
            
            return valeur_hexadecimale
    except FileNotFoundError:
        print("Le fichier image n'a pas été trouvé.")
    except Exception as e:
        print("Une erreur s'est produite :", e)

dicthexa = {}

# Exemple d'utilisation
chemin_dossier = r"C:\Users\mdum7\Dropbox\Travail\EPF\Java\image" 
files = os.listdir(chemin_dossier)
for folder in files:
    csous_dossier_image = chemin_dossier + f"\{folder}"
    print(csous_dossier_image[52])
    if csous_dossier_image[3:] != r"C:\\Users\\mdum7\\Dropbox\\Travail\\EPF\\Java\\image\\imagetohexa.py":
        imageList = os.listdir(csous_dossier_image)
        for picture in imageList:
            valeur_hexadecimale = image_to_hex(csous_dossier_image + f"\{picture}")
            dicthexa[picture] = valeur_hexadecimale

os.mkdir(chemin_dossier + "/fileHexa.json")

with open(chemin_dossier + "/fileHexa.json", 'w') as fichier_json:
    json.dump(dicthexa, fichier_json)
