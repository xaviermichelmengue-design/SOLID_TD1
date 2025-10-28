#!/bin/bash
echo "=== EXÉCUTION DE TOUS LES PRINCIPES SOLID ==="

echo -e "\n🔴 SRP AVANT (Violation - Classe avec multiples responsabilités):"
java -cp bin srp.avant.Main

echo -e "\n🟢 SRP APRES (Respect - Responsabilités séparées):"
java -cp bin srp.apres.Main

echo -e "\n🔴 OCP AVANT (Violation - Modification nécessaire pour nouvelles formes):"
java -cp bin ocp.avant.Main

echo -e "\n🟢 OCP APRES (Respect - Extension sans modification):"
java -cp bin ocp.apres.Main

echo -e "\n🔴 LSP AVANT (Violation - Carré ne peut substituer Rectangle):"
java -cp bin lsp.avant.MainLsp

echo -e "\n🟢 LSP APRES (Respect - Toutes les formes substituables):"
java -cp bin lsp.apres.MainLsp2

echo -e "\n🔴 ISP AVANT (Violation - Interface trop large):"
java -cp bin isp.avant.Main

echo -e "\n🟢 ISP APRES (Respect - Interfaces spécifiques):"
java -cp bin isp.apres.MainISP

echo -e "\n🔴 DIP AVANT (Violation - Dépendance concrète):"
java -cp bin dip.avant.Main

echo -e "\n🟢 DIP APRES (Respect - Dépendance abstraite):"
java -cp bin dip.apres.Main

echo -e "\n✅ Tous les tests terminés!"
