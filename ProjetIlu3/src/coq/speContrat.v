Module Type Contrat.

  (* Types *)
  Parameter fournisseur : Type.
  Parameter produit : Type.
  Parameter contrat : Type.

  (* Opérateurs *)
  Parameter creer_contrat : fournisseur -> produit -> string -> string -> contrat.
  Parameter fournisseur_du_contrat : contrat -> fournisseur.
  Parameter produit_du_contrat : contrat -> produit.
  Parameter valide : contrat -> bool.

  (* Axiomes *)
  Axiom fournisseur_correct : forall f p d1 d2,
    fournisseur_du_contrat (creer_contrat f p d1 d2) = f.

  Axiom produit_correct : forall f p d1 d2,
    produit_du_contrat (creer_contrat f p d1 d2) = p.

  Axiom contrat_valide_si_dates_correctes : forall f p d1 d2,
    d1 < d2 -> valide (creer_contrat f p d1 d2) = true.

End Contrat.
